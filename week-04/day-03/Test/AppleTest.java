import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    String apple = "apple";
    Apple red = new Apple(apple);

    @Test
    public void getApple() throws Exception {
        assertEquals(apple,red.getApple());
    }
}

