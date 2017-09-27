import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {

    Sharpie blue = new Sharpie("blue",3.5f);
    float ink = blue.inkAmount - blue.width;

    @Test
    public void use() throws Exception {
        blue.use();
        assertEquals((int) ink, (int) blue.inkAmount);
    }
}