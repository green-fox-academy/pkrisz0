package com.greenfox.pkrisz0.simbank.model;

public class BankAccount {
    String name;
    float balance;
    String animalType;
    String balanceF;
    String currency;

    public BankAccount(String name, float balance, String animalType) {
        this.name = name;
        this.animalType = animalType;
        this.balance = balance;
        this.balanceF = String.format("%.02f", balance);
        this.currency = "Zebra";
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBalanceF() {
        return balanceF;
    }

    public void setBalanceF(String balanceF) {
        this.balanceF = balanceF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
