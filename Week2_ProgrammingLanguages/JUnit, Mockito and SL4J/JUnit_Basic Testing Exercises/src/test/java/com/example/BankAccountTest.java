import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
public class BankAccountTest {
    private BankAccount account;
    @Before
    public void setUp() {
        account = new BankAccount(100);
    }
    @After
    public void tearDown() {
        account.closeAccount(); 
    }
    @Test
    public void testDeposit() {
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }
    @Test
    public void testWithdraw() {
        account.withdraw(40);
        assertEquals(60, account.getBalance());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawInsufficientFunds() {
        account.withdraw(200);
    }
}