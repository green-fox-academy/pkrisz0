package com.greenfox.pkrisz0.simbank.model;

public class BankAccount {
    String name;
    String balance;
    String animalType;
    String currency;
    boolean king;
    boolean good;

    public BankAccount() {
        this.currency = "Zebra";
        this.king = false;
    }

    public BankAccount(String name, String balance, String animalType, boolean good, boolean king) {
        this.name = name;
        this.animalType = animalType;
        this.balance = balance;
        this.currency = "Zebra";
        this.king = king;
        this.good = good;
    }

    public boolean isGood() {
        return good;
    }

    public void setGood(boolean good) {
        this.good = good;
    }

    public boolean isKing() {
        return king;
    }

    public void setKing(boolean king) {
        this.king = true;
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
