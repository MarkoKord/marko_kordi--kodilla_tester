package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTestSuite {
    Bank bank = new Bank();
    CashMachine cashMachine1 = new CashMachine();
    CashMachine cashMachine2 = new CashMachine();


    @Test
    public void TestTotalBalance_shouldHaveZeroBalance() {
        int result = bank.totalBalance();
        assertEquals(0, result);
    }
    @Test
    public void TestTotalBalance_shouldCalculateBalanceIfCashMachineAdded() {
        cashMachine1.addTransaction(300);
        cashMachine2.addTransaction(100);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        int result = bank.totalBalance();
        assertEquals(400, result);
    }
    @Test
    public void TestCountDeposits_shouldCalculateAllDeposits(){
        cashMachine1.addTransaction(300);
        cashMachine1.addTransaction(300);
        cashMachine2.addTransaction(400);
        cashMachine2.addTransaction(-100);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        int result = bank.countDeposits();
        assertEquals(3, result);
    }
    @Test
    public void TestCountWithdraws_shouldCalculateAllWithdraws(){
        cashMachine1.addTransaction(-300);
        cashMachine1.addTransaction(300);
        cashMachine2.addTransaction(400);
        cashMachine2.addTransaction(-100);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        int result = bank.countWithdraws();
        assertEquals(2, result);
    }
    @Test
    public void TestSumoOfDeposits_shouldCalculateSumOfAllDeposits(){
        cashMachine1.addTransaction(400);
        cashMachine1.addTransaction(300);
        cashMachine2.addTransaction(300);
        cashMachine2.addTransaction(-100);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        double result = bank.sumOfDeposits();
        assertEquals(1000, result);
    }
    @Test
    public void TestSumOfWithdraws_shouldCalculateSumOfAllWithdraws(){
        cashMachine1.addTransaction(-500);
        cashMachine1.addTransaction(-200);
        cashMachine2.addTransaction(300);
        cashMachine2.addTransaction(-800);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        double result = bank.sumOfWithdraws();
        assertEquals(1500, result);
    }
    @Test
    public void TestCalculateAverageDeposits_shouldCalculateAverageOfAllDeposits() {
        cashMachine1.addTransaction(700);
        cashMachine1.addTransaction(250);
        cashMachine2.addTransaction(250);
        cashMachine2.addTransaction(-720);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        double result = bank.calculateAverageDeposits();
        assertEquals(400, result);

    }
    @Test
    public void TestCalculateAverageWithdraws_shouldCalculateAverageOfAllWithdraws() {
        cashMachine1.addTransaction(400);
        cashMachine1.addTransaction(350);
        cashMachine2.addTransaction(-100);
        cashMachine2.addTransaction(-200);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        double result = bank.calculateAverageWithdraws();
        assertEquals(150, result);
    }



}

