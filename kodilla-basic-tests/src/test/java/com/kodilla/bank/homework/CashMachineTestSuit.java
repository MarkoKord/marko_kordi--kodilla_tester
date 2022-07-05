package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTestSuit {




    @Test
    public void TestGetTrans_shouldHaveZeroValues() {
        CashMachine cashMachine = new CashMachine();
        int values = cashMachine.getTrans();
        assertEquals(0, values);
    }

    @Test
    public void TestTotalBalance_shouldShowTotalBalanceOfCashMachines() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(10);
        int values = cashMachine.getBalance();
        assertEquals(10, values);

    }

    @Test
    public void TestGetNumberOfWithdraws_shouldShowNumberOfWithdraws() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(-300);
        int values = cashMachine.getNumberOfWithdraws();
        assertEquals(2, values);
    }

    @Test
    public void TestGetNumberOfDeposits_ShouldShowNumberOfDeposit() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(0);
        int values = cashMachine.getNumberOfDeposit();
        assertEquals(3, values);

    }

    @Test
    public void TestAverageOfWithdraws_ShouldShowAverageOfWithdraws() {
        CashMachine bankomat = new CashMachine();
        bankomat.addTransaction(-200);
        bankomat.addTransaction(-300);
        bankomat.addTransaction(-400);

        Bank bank = bank.addCashMachine(bankomat);
     double result = bank.calculateAverageWithdraws();
       assertEquals(-250, result);

    }
}