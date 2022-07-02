package com.kodilla.bank.homework;

public class Bank {
    private int size;
    public CashMachine[] cashMachines;

    public Bank() {


    }


    public void addCashMachine(CashMachine machine) {   //TABLICA BANKOMATÓW
        this.size++;                                                               //inkrementacja dodanie do tabeli kolejnego banku
        CashMachine[] newTab = new CashMachine[this.size];                         //utworzenie tabeli
        System.arraycopy(cashMachines, 0, newTab, 0, this.size);
        newTab[this.size - 1] = machine;                                           // przypisanie elementu do ostatniego indeksu tabeli (machine- nazwa zmienna tabeli)
        this.cashMachines = newTab;                                                // cashMachines = nowa tabela
    }

    public int totalBalance() {  //CAŁKOWITY BALANS ZE WSZYSTKICH BANKOMATOW
        int balance = 0;
        for (CashMachine cashMachine : this.cashMachines) {
            balance = cashMachine.getBalance();
        }
        return balance;
    }

    public double getAverageOfDeposits() {    //ŚREDNIA WARTOSC WPLATY
        double sumAdd = 0;
        int count = 0;
        int transactions[];
        for (CashMachine cashMachine : this.cashMachines) {
           transactions = cashMachine.getValues();
           for(int i=0 ; i<cashMachine.getValues().length ; i++) {
               if(transactions[i] > 0) {
                   count++;
                   sumAdd =


               }



           }

            }
        }



    public double getAverageOfWithdraws() {  //SREDNIA WARTOSC WYPLATY
        double average = 0;
        for (CashMachine cashMachine : this.cashMachines) {
            average = cashMachine.getSumOfWithdraw() / cashMachine.getNumberOfWithdraws();
        }
        return average;
    }
}
