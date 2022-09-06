package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTestSuite {

    CashMachine cashMachine = new CashMachine();

    @Test
    public void TestGetTrans_shouldHaveZeroValues() {
        int values = cashMachine.getTrans();
        assertEquals(0, values);
    }

    @Test
    public void TestTotalBalance_shouldReturnTotalBalanceOfCashMachines() {

        cashMachine.addTransaction(10);
        int values = cashMachine.getBalance();
        assertEquals(10, values);

    }

    @Test
    public void TestGetNumberOfWithdraws_shouldReturnNumberOfWithdraws() {
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(-300);
        cashMachine.addTransaction(260);
        int values = cashMachine.getNumberOfWithdraws();
        assertEquals(2, values);
    }

    @Test
    public void TestGetNumberOfDeposits_shouldReturnNumberOfDeposits() {
        cashMachine.addTransaction(-300);
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(300);
        int values = cashMachine.getNumberOfDeposit();
        assertEquals(2, values);
    }
    @Test
    public void TestGetSumOfWithdraws_shouldReturnSumOfAllWithdraws() {
        cashMachine.addTransaction(-300);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(-100);

        int values = cashMachine.getSumOfWithdraw();

        assertEquals(values, 600);
    }
    @Test
    public void TestGetSumOfDeposits_shouldReturnSumOfAllWithdraws() {
        cashMachine.addTransaction(-199);
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(150);

        int values = cashMachine.getSumOfDeposit();

        assertEquals(values, 200);
    }
}


