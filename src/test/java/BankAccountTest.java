import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() throws Exception {
        account = new BankAccount("Inga", 2000);
    }

    @Test
    @DisplayName("Check Deposit")
    void deposit() {
        assertEquals(2500, account.deposit(500));
    }

    @Test
    void withdraw() {
        assertEquals(1000, account.withdraw(1000));
    }
}