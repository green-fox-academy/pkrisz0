public class Fibonacci {
    int index;

    public Fibonacci() {

    }

    public int fibonacci(int index) {
        if (index == 0)
            return 0;
        else if (index == 1)
            return 1;
        else
            return fibonacci(index - 2) + fibonacci(index - 3);

    }
}

//0, 1, 1, 2, 3, 5, 8, 13, 21