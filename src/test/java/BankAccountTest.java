import org.example.BankAccount;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    @Test
    public void canAddToAccount() {
        BankAccount checkingAmount = new BankAccount();
        int actual = checkingAmount.deposit();
        int expected = ;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSubtractFromAccount() {
        BankAccount checkingAmount = new BankAccount();
        int actual = checkingAmount.withdrawal();
        int expected = ;
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void canAddInterest() {
        BankAccount checkingAmount = new BankAccount();
        int actual = checkingAmount.interest();
        int expected = ;
        assertThat(actual).isEqualTo(expected);
}

