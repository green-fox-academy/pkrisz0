package com.greenfox.pkrisz0.frontend.model;

public class DoesUntil {

    int result;

    public DoesUntil() {
    }

    public DoesUntil(String what, int until) {
        this.result = 0;
        if (what.equals("sum")){
            this.sum(until);
        } if (what.equals("factor")){
            this.factor(until);
        }
    }


    public int sum(int until){
        for (int i = 1; i <= until; i++) {
            result += i;
        }
        return result;
    }

    public int factor(int until){
        int end = 1;
        for (int i = 1; i <= until; i++) {
            end *= i;
        }
        result = end;
        return result;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

}
