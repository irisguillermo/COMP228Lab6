public class TransactionRunnable implements  Runnable{
    private static final int DELAY = 1;
    private BankAccount account; //account from which to withdraw from
    private double amount; //amount to withdraw
    private int count; // number of repetition

    public  TransactionRunnable (BankAccount account, double amount, int count)
    {
        account = account;
        amount = amount;
        count = count;
    }

    @Override
    public void run() {

    }
}
