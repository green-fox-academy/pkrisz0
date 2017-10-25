package com.greenfox.pkrisz0.simbank.model;

public class BankAccount {
    String name;
    String balance;
    String animalType;
    String currency;
    boolean isKing;

    public BankAccount(String name, String balance, String animalType) {
        this.name = name;
        this.animalType = animalType;
        this.balance = balance;
        this.currency = "Zebra";
        this.isKing = false;

    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
