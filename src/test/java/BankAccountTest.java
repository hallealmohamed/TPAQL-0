import org.emp.gl.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    @Test
    void depositShouldIncreaseBalance() {
        BankAccount account = new BankAccount(100, 0.05);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    void withdrawShouldDecreaseBalance() {
        BankAccount account = new BankAccount(100, 0.05);
        account.withdraw(30);
        assertEquals(70, account.getBalance());
    }

    @Test
    void transferShouldMoveMoneyBetweenAccounts() {
        BankAccount account1 = new BankAccount(100, 0.05);
        BankAccount account2 = new BankAccount(200, 0.05);
        account1.transfer(50, account2);
        assertEquals(50, account1.getBalance());
        assertEquals(250, account2.getBalance());
    }

    @Test
    void addInterestShouldUpdateBalance() {
        BankAccount account = new BankAccount(100, 0.1);
        account.addInterest();
        assertEquals(110, account.getBalance());
    }

    @Test
    void negativeDepositShouldThrowException() {
        BankAccount account = new BankAccount(100, 0.05);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-50));
    }

    @Test
    void insufficientWithdrawShouldThrowException() {
        BankAccount account = new BankAccount(100, 0.05);
        assertThrows(IllegalStateException.class, () -> account.withdraw(150));
    }
}