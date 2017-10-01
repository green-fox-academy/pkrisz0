public class Counter {
    int value = 0;
    int initial = 0;

    public Counter () {
        this.value = value;
    }


    public Counter (int value) {
        this.value = value;
        this.initial = value;
    }

    public int add() {
        return value += 1;
    }

    public int add(int i) {
        return value += i;
    }

    public int get() {
        return value;
    }

    public int reset() {
        return value = this.initial;
    }

    public static void main(String[] args) {
        Counter mamma = new Counter();
        mamma.add(600);
        System.out.println(mamma.get());
        mamma.reset();
        System.out.println(mamma.get());
    }
}









/*
Create Counter class
which has an integer field value
when creating it should have a default value 0 or we can specify it when creating
we can add(number) to this counter another whole number
or we can add() without parameters just increasing the counter's value by one
nd we can get() the current value
 also we can reset() the value to the initial value
*/