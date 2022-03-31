package Lab;

public class CreditCardAccount extends Account {
    private int limit;

    public CreditCardAccount(int accountNum, double amount)
    {
       super(accountNum, "credit card", amount);
    }
 
    public void creditLimit(int limit)
    {
       this.limit = limit;
    }

    public int getLimit()
    {
       return limit;
    }
}
