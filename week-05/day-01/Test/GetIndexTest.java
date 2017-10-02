import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GetIndexTest {

    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    GetIndex index;

    @Test
    public void getIndex() throws Exception {
        GetIndex index = new GetIndex();
        assertEquals(0, index.getIndex(list,1));
    }

    @Test
    public void getIndex2() throws Exception {
        GetIndex index = new GetIndex();
        assertNotEquals(3, index.getIndex(list,3));
    }

    @Test
    public void getIndex3() throws Exception {
        GetIndex index = new GetIndex();
        assertEquals(-1, index.getIndex(list,5));
    }

}