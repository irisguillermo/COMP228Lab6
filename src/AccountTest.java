import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class AccountTest
{
    public AccountTest(){
    }
    public static void main (String [] args)
    {
        String[] transaction = new String[]{"Withdraw", "Deposit"};
        SortedSet<String>  transaction1 = new TreeSet<>(Arrays.asList(transaction));
        System.out.print("sorted set:");
        printSet(transaction1);
        //not quiet sure about this will work on it 


    }

    private static void printSet(SortedSet<String> transaction1) {
    }
}
