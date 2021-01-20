package equalshashcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest {
	
	@Test
	void test_equals_for_both_null_CurrencyCode() {
		Money income = new Money(55 , null);
		Money expenses = new Money(55 , null);
		
		assertTrue(income.equals(expenses), "Income should be equal to expenses");
	}
	
	@Test
	void test_not_equals_for_one_null_CurrencyCode() {
		Money income = new Money(55 , null);
		Money expenses = new Money(55 , "NPR");
		
		assertTrue(!income.equals(expenses),"Income should not be equal to expenses");
	}

	@Test
	void test_equals_for_same_Amount_and_same_CurrencyCode() {
		Money income = new Money(55 , "NPR");
		Money expenses = new Money(55 , "NPR");
		
		assertTrue(income.equals(expenses),"Both should be equal for equal amount and same currency code.");
	}
	
	@Test
	void test_not_equal_for_diff_amount_and_same_CurrencyCode() {
		Money income = new Money(95 , "NPR");
		Money expenses = new Money(55 , "NPR");
		
		assertFalse(income.equals(expenses),"Both should not be equal for unequal amount");
	}
	
	@Test
	void test_not_equals_for_same_Amount_and_diff_CurrencyCode() {
		Money income = new Money(55 , "INR");
		Money expenses = new Money(55 , "NPR");
		
		assertFalse(income.equals(expenses), "Should not be equal for different CurrencyCode");
	}
	
	@Test
	void test_not_equal_for_diff_Amount_and_diff_CurrencyCode() {
		Money income = new Money(47 , "INR");
		Money expenses = new Money(55 , "NPR");
		
		assertFalse(income.equals(expenses),"Should not be equal for different amount and different CurrencyCode.");
	}
	
	//checking for hashCode for object collision
	
//	If two objects are equal according to the {@code equals(Object)}
//         method, then calling the {@code hashCode} method on each of
//         the two objects must produce the same integer result.
	@Test
	void givenInstanceOfSameClassWithSameAmountAndCurrencyCode_thenReturnsSamehashCodeForBothObject() {
		Money income = new Money(88, "UPR");
		Money expenses = new Money(88 ,"UPR");
		
		System.out.println("HashCode for income :"+income.hashCode());
		System.out.println("HashCode for expenses :"+expenses.hashCode());
		assertEquals(income.hashCode(), expenses.hashCode(),"HashCode should be same for same class instance and same money,currencyCode");
	}
}
