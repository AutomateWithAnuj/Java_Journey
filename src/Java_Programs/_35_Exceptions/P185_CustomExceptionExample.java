package Java_Programs._35_Exceptions;

/**
 * Demonstrates the use of a custom exception in Java.
 * 
 * The Bank class allows adding amounts only if the currencies match.
 * If currencies don't match, a custom exception is thrown and handled.
 */
class Bank {
    private String currency; // Currency of the bank account
    private Integer amount;  // Balance amount in the account

    // Constructor to initialize Bank object
    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    // Getter for currency
    public String getCurrency() {
        return currency;
    }

    // Setter for currency
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    // Getter for amount
    public Integer getAmount() {
        return amount;
    }

    // Setter for amount
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Adds the amount of another bank account if currencies match.
     * Throws a custom exception if currencies are different.
     *
     * @param otherBank The bank whose amount is to be added
     * @return Sum of amounts if currencies match, else 0
     */
    public Integer add(Bank otherBank) { // here we are taking the Bank class as arguments
        if (otherBank.currency.equalsIgnoreCase("INR")) {
            // Currencies match; add amounts
            return this.amount + otherBank.amount;
        } else {
            // Currencies don't match; throw and catch custom exception
            try {
                throw new CustomException("Currency mismatch! Cannot add amounts."); 
            } catch (CustomException e) {
                System.out.println(e.getMessage()); // Output: Currency mismatch! Cannot add amounts.
            }
        }
        return 0; // Return 0 if currencies don't match
    }
}

/**
 * Custom exception class to handle specific banking errors
 */
class CustomException extends Exception {
    public CustomException(String msg) {
        super(msg);
    }
}

/**
 * Main class to test Bank addition and custom exception handling
 */
public class P185_CustomExceptionExample {

    public static void main(String[] args) {
        // Create bank objects with different currencies
        Bank sbi = new Bank("INR", 100);
        Bank icici = new Bank("INR", 123);
        Bank cityBank = new Bank("USD", 101);

        // Add amounts for banks with matching currency
        int total1 = sbi.add(icici);
        System.out.println(total1); // Output: 223

        // Attempt to add amounts for banks with mismatched currency
        int total2 = sbi.add(cityBank);
        System.out.println(total2); // Output: 0 (after printing exception message)
    }
}
