public class Account
{
   public double  balance;

    public Account()
    {
        balance = 0;
    }

    public Account(int i, int i1) {
    }

    public void deposit (double amount)
    {
        System.out.print("Depositing" + amount);
        double newBalance = balance + amount;
        System.out.println("new balance is " + newBalance);
        balance = newBalance;
    }

    public void withdraw (double amount)
    {
        System.out.print("DWithdrawing" + amount);
        double newBalance = balance - amount;
        System.out.println("new balance is " + newBalance);
        balance = newBalance;
    }

    public double getBalance()
    {
        return balance;
    }

public class AccountTest
{
    public static void main (String [ ] args)
    {
        Account account = new Account(1000, 10);
        account.withdraw(100);
        account.deposit(500);
        account.getBalance();
        System.out.println(account.getBalance());
    }

}

}