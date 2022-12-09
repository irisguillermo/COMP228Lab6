public class WithdrawRunnable implements  Runnable
{

    private static final int DELAY = 1;
    private BankAccount account; //account from which to withdraw from
    private double amount; //amount to withdraw
    private int count; // number of repetition

    public  WithdrawRunnable (BankAccount account, double amount, int count)
    {
        account = account;
        amount = amount;
        count = count;
    }

    @Override
    public void run() {
        try
        {
            for (int i = 1; i <= count; i++)
            {
                account.withdraw(amount);
                Thread.sleep(DELAY);
            }
        }
        catch (InterruptedException exception) { }


    }
}
