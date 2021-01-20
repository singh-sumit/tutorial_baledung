package equalshashcode;

public class Money {

	int amount;
	String currencyCode;

	// constructor
	Money(int amount, String currencyCode) {
		this.amount = amount;
		this.currencyCode = currencyCode;
	}

	// methods overriden equals and hashcode

	@Override
	public boolean equals(Object o) {
		if (o == this) // o and this is same instance
			return true;
		if (!(o instanceof Money)) // o is not instance of Money then false
			return false;

		// else o and this is instance of same class
		Money other = (Money) o;
		boolean isCurrencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
				|| (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
		
		return this.amount == other.amount && isCurrencyCodeEquals;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + amount;
		result = prime * result + (currencyCode == null ? 0 : currencyCode.hashCode());
		
		return result;
	}

	public static void main(String[] args) {
		Money income = new Money(55, "NPR");
		Money expenses = new Money(55, null);

		boolean isBalanced = income.equals(expenses);

		System.out.println(isBalanced);
	}

}
