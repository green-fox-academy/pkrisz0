package com.greenfox.pkrisz0.frontend.model;

import java.util.stream.IntStream;

public class ArrayHandler {
    Object result;

    public ArrayHandler(String what, int[] array) {
        this.result = this.calculateResult(what, array);
    }

    public Object calculateResult(String what, int[] array){
       if (what.equals("sum")){
           return sum(array);
       }
       if (what.equals("multiply")){
           return multiply(array);
       } else {
           return doubler(array);
       }
    }

    public int sum(int[] array){
        return IntStream.of(array).sum();
    }

    public int multiply(int[] array){
        int result=1;
        for(int value : array) {
            result *= value;
        }
        return result;
    }

    public int[] doubler(int[] array){
        int[] doubled = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int temp = array[i] * 2;
            doubled[i] = temp;
        }
        return doubled;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
