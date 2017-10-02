import org.junit.Test;

import static org.junit.Assert.*;

public class NumberConverterTest {
    NumberConverter converter;

    @Test
    public void converter() throws Exception {
    converter = new NumberConverter();
    assertEquals("five", converter.converter(5));
    }

    @Test
    public void converter2() throws Exception {
        converter = new NumberConverter();
        assertNotEquals("four", converter.converter(5));
    }

    @Test
    public void converter3() throws Exception {
        converter = new NumberConverter();
        assertEquals("sixteen", converter.converter(16));
    }

    @Test
    public void converter4() throws Exception {
        converter = new NumberConverter();
        assertEquals("twenty six", converter.converter(26));
    }

    @Test
    public void converter5() throws Exception {
        converter = new NumberConverter();
        assertEquals("forty six", converter.converter(46));
    }

    @Test
    public void converter6() throws Exception {
        converter = new NumberConverter();
        assertNotEquals("fortysix", converter.converter(46));
    }

    @Test
    public void converter7() throws Exception {
        converter = new NumberConverter();
        assertEquals("one hundred and forty six", converter.converter(146));
    }
}