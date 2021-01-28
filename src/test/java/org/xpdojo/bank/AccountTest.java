package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void newBankAccountIsEmpty() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(100);
        assertThat(account.balance()).isEqualTo(100);
    }

    @Test
    public void multipleDepositsGiveMeLoadsMoney() {
        Account account = new Account();
        account.deposit(100);
        account.deposit(200);
        assertThat(account.balance()).isEqualTo(300);
    }
}
