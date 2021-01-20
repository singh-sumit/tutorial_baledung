## Equals() & hashCode()

### Default working of equals() and hashCode()

- By Default <code>Object</code> class implements equals() and hashCode() which is described as
	<code>equals()</code>
    ```java
	    public boolean equals(Object obj) {
        return (this == obj);
    }
    ```
- Return hashCode of the object.
    ```java
    @HotSpotIntrinsicCandidate
    public native int hashCode();  
    ```
- Example:
  consider

    ```java
    class Money {
        private int amount;
        private String currencyCode;
    }

    Money expenses = new Money(55, "USD");
    Money income = new Money(55, "USD");
        
    LOGGER.info("hashcode of expenses instance =>"+expenses.hashCode());
    LOGGER.info("hashcode of income instance =>"+income.hashCode());
    System.out.println("Is expenses == income? "+expenses.equals(income));      //results false
    ```
   *The default implementation of equals() in the class Object says that equality is the same as object identity. And income and expenses are two distinct instances.*
  