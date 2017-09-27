import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    Fibonacci test = new Fibonacci();


    @Test
    public void testFibonacci() throws Exception {
        assertEquals(1, test.fibonacci(3));
    }

    @Test
    public void testFivonacciWithZero() throws Exception {
        assertEquals(0, test.fibonacci(0));
    }

    @After
    public void print() {
        System.out.println("Test ran.");
    }

}