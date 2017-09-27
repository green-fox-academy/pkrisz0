import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

    Sum testMe = new Sum();
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,5,5,5,5));

    @Test
    public void sumMethod() throws Exception {
        assertEquals(25,testMe.sumMethod(list));
    }
}