package com.kodilla.bank.homework;

public class Bank {
    private int size;
    public CashMachine[] cashMachines;

    public Bank() {
        this.cashMachines = new CashMachine[0];

    }


    public void addCashMachine(CashMachine machine) {   //TABLICA BANKOMATÓW
        this.size++;                                                               //inkrementacja dodanie do tabeli kolejnego banku
        CashMachine[] newTab = new CashMachine[this.size];                         //utworzenie tabeli
        System.arraycopy(cashMachines, 0, newTab, 0, this.cashMachines.length);
        newTab[this.size - 1] = machine;                                           // przypisanie elementu do ostatniego indeksu tabeli (machine- nazwa zmienna tabeli)
        this.cashMachines = newTab;                                                // cashMachines = nowa tabela
    }

    public int totalBalance() {
        int balance = 0;
        for (CashMachine cashMachine : this.cashMachines) {
            balance += cashMachine.getBalance();
        }
        return balance;
    }

    public int countDeposits() {
        int count = 0;
        for (CashMachine machine : this.cashMachines) {
            count += machine.getNumberOfDeposit();
        }
        return count;
    }

    public int countWithdraws() {
        int count = 0;
        for (CashMachine machine : this.cashMachines) {
            count += machine.getNumberOfWithdraws();
        }
        return count;
    }

    public double sumOfDeposits() {
        double sum = 0;
        for (CashMachine machine : this.cashMachines) {
            sum += machine.getSumOfDeposit();
        }
        return sum;
    }

    public double sumOfWithdraws() {
        double sum = 0;
        for (CashMachine machine : this.cashMachines) {
            sum += machine.getSumOfWithdraw();
        }
        return sum;
    }

    public double calculateAverageDeposits() {
        return sumOfDeposits() / countDeposits();
    }

    public double calculateAverageWithdraws() {
        return sumOfWithdraws() / countWithdraws();
    }
}
