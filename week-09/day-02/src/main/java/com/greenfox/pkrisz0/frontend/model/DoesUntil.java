package com.greenfox.pkrisz0.frontend.model;

public class DoesUntil {

    int result;

    public DoesUntil() {
    }

    public DoesUntil(String what, int until) {
        if (what.equals("sum")){
            this.result = sum(until);
        } if (what.equals("factor")){
            this.result = factor(until);
        }
    }

    public int sum(int until){
        int sum = 0;
        for (int i = 1; i <= until; i++) {
            sum += i;
        }
        return sum;
    }

    public int factor(int until){
        int end = 1;
        for (int i = 1; i <= until; i++) {
            end *= i;
        }
        int temp = end;
        return temp;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
