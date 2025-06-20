package Java_Programs._35_Exceptions;

class Bank {
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Integer add(Bank bankname){
        if (bankname.currency.equalsIgnoreCase("INR")){
            return bankname.amount+this.amount;
        }else {
            try {
                throw new CustomException("Custom Exception");
            } catch (CustomException e) {
                System.out.println(e.getMessage());
            }
        }
        return 0;
    }
}
class CustomException extends Exception{
    public CustomException(String msg) {
        super(msg);
    }
}
public class P185_CustomExceptionExample{
    public static void main(String[] args) {
        Bank sbi = new Bank("INR",100);
        Bank icici = new Bank("INR",123);
        Bank cityBank = new Bank("USD",101);
        int total1 = sbi.add(icici);
        System.out.println(total1);
        int total2 = sbi.add(cityBank);
        System.out.println(total2);
    }
}