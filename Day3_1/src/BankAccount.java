public class BankAccount {

    // Task 3:
    // create a class "BankAccount" with property "balance" (should be decimal number)
    //   * create empty default constructor for it
    //   * create a constructor with parameter for setting balance.
    //   * create a method "deposit" with one parameter "amount" (decimal number)
    //     which allows the user to increase the balance.
    //   * create a method "withdraw" with one parameter "amount"
    //    (decimal number) which allows the user to decrease the balance.
    //   * create a method "printBalance" which displays the current balance to user
    //   * method for transfer balance from one bank account to another
    public double balance;
    public BankAccount(){}
    public BankAccount(int balance)
    {
        this.balance = balance;
    }
    public void deposit(double amount)
    {
        balance += amount;
    }
    public void withdraw(double amount)
    {
        balance -= amount;
    }
    public void printBalance()
    {
        System.out.println(balance);
    }
    public void transferBalance(BankAccount otherAcc, double amount)
    {
        otherAcc.balance += amount;
        balance -= amount;
    }
}
