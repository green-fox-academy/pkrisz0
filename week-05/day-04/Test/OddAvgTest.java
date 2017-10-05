import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OddAvgTest {
    OddAvg meh = new OddAvg();

    @Test
    void oddAverage_1() {
        assertEquals(6, meh.oddAverage(Arrays.asList(4,8,9,6,3)));
    }

    @Test
    void oddAverage_2() {
        assertEquals(0, meh.oddAverage(Arrays.asList(6,6,6,6,6)));
    }

    @Test
    void oddAverage_3() {
        assertEquals(3, meh.oddAverage(Arrays.asList(0,0,0,0,3)));
    }
}