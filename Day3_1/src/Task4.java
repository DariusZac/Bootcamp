public class Task4 {


    //update your solution:
    // * Encapsulate the balance property so it is private
    // * add to "withdraw" method, so it would be impossible to withdraw
    // more money than exists in bank account. If there is an attempt to withdraw
    // more money than exialidation tsts in bank account, output message:
    // "There is not enough funds."
    // * Modify "transferFrom" method so it would be impossible to transfer more
    // money from the other account than it's balance.
    // For example, if bank account A has 50 units and bank account B has 25 units
    // and we try to transfer 30 units from B to A, then it should output:
    // "Transfer canceled. You are trying to transfer 30 units, but only 25 are available."
    // * add a limit for depositing money. If the deposit is greater
    // than 5000, then it should not
    // do the deposit and output message:
    // "Transaction canceled. Max deposit - 5000 | Your deposit: 6000"
    // * call these methods and demonstrate how they work, for example:
    // * write a code which tries to withdraw more money than there is in bank account
    // * write a code which tries to deposit more than max limit
    // * write a code which tries to transfer more money from one account
    // to another account than possible




    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(100);
        BankAccount acc2 = new BankAccount(200);
        acc1.withdraw(120);
        acc1.deposit(5500);
        acc1.transferFrom(acc2, 110);
        acc2.printBalance();
        acc1.transferFrom(acc2, 50);
        acc2.printBalance();
    }


public static class BankAccount
{
    private double balance;
    final double LIMIT = 5000;
    public BankAccount(){}
    public BankAccount(int balance)
    {
        this.balance = balance;
    }
    public void deposit(double amount)
    {
        if (amount <= LIMIT){
            balance += amount;
        }else System.out.println("Transaction canceled. " +
                "Max deposit - " + LIMIT + " | Your deposit: " + amount);
    }
    public void withdraw(double amount)
    {
        if ((balance - amount) >= 0) {
            balance -= amount;
        } else {
            System.out.println("There is not enough funds");
        }
    }
    public void printBalance()
    {
        System.out.println(balance);
    }
    public void transferFrom(BankAccount otherAcc, double amount)
    {
        if (amount <= LIMIT)
        {
            if ((balance - amount) >= 0 )
            {
                otherAcc.balance += amount;
                balance -= amount;
            }else System.out.println("Transfer canceled." +
                    " You are trying to transfer " + amount + " units," +
                    " but only " + balance + " are available.");
        }else System.out.println("Transaction canceled. " +
                "Max deposit - " + LIMIT + " | Your deposit: " + amount);
    }
}
}