package com.greenfox.pkrisz0.frontend.model;

public class ArrayInputObject {
    String what;
    int[] numbers;

    public ArrayInputObject() {

    }

    public ArrayInputObject(String what, int[] numbers) {
        this.numbers = numbers;
        this.what = what;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

}
