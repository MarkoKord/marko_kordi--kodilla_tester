package com.kodilla.bank.homework;

public class CashMachine {
    private int[] values;


    public CashMachine() {
        this.values = new int[0];

    }

    public void addTransaction(int value) {
        int transactionsSize = this.getTrans() + 1;                            //dlugosc tablicy po dodadniu nowej transakcji

        int[] newTab = new int[transactionsSize];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[transactionsSize - 1] = value;
        this.values = newTab;
    }

    public int getTrans() {                                                    //zwracanie liczby transakcji
        return values.length;
    }

    public int getBalance() {                                                  //zwracanie salda bankomatu
        int balance = 0;
        for (int value : this.values) {
            balance += value;
        }
        return balance;

    }

    public int getNumberOfDeposit() {                   //ilość transakcji dodatnich(wpłat)           //przeiterowac po wszystkich elementach przeiterowac wartosci, stworzyc tabclie pomocnicza,petla for each   // i wartosc wieksza i mniejsza do zer
        int deposits = 0;
        for (int value : this.values) {
            if (value > 0) {
                deposits++;                              // deposits ++, będzie liczył ilość transakcji

            }


        }
        return deposits;
    }

    public int getSumOfDeposit() {                     //suma transakcji dodatnich (wplat)
        int sumDeposits = 0;
        for (int value : this.values) {
            if (value > 0) {
                sumDeposits += value;                //dodawanie transakcji do siebie(suma)
            }
        }
        return sumDeposits;

    }


    public int getNumberOfWithdraws() {               //zwracanie ilosci transakcji ujemnych (wyplat)
        int withraws = 0;
        for (int value : this.values) {
            if (value < 0) {
                withraws++;

            }

        }
        return withraws;
    }

    public int getSumOfWithdraw() {                 //zwracanie sumy transakcji ujemnych(wyplat)
        int sumOfWithdraws = 0;
        for (int value : this.values) {
            if (value < 0) {
                sumOfWithdraws += value;
            }

        }
        return sumOfWithdraws * -1;
    }
}

