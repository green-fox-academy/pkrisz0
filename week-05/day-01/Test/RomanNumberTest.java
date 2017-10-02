import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumberTest {

    RomanNumber romanNumber;

    @Before
    public void setUp() throws Exception {
        if (romanNumber == null) {
            romanNumber = new RomanNumber();
        }
    }

    @Test
    public void convertToRomanI() throws Exception {
        assertEquals("I", romanNumber.convertToRoman(1));
    }

    @Test
    public void convertToRomanII() throws Exception {
        assertEquals("II", romanNumber.convertToRoman(2));
    }

    @Test
    public void convertToRomanIII() throws Exception {
        assertEquals("III", romanNumber.convertToRoman(3));
    }

    @Test
    public void convertToRomanIV() throws Exception {
        assertEquals("IV", romanNumber.convertToRoman(4));
    }

    @Test
    public void convertToRomanVI() throws Exception {
        assertEquals("VI", romanNumber.convertToRoman(6));
        assertEquals("VII", romanNumber.convertToRoman(7));
        assertEquals("VIII", romanNumber.convertToRoman(8));
    }

    @Test
    public void convertToRomanVII() throws Exception {
        assertEquals("IX", romanNumber.convertToRoman(9));
    }
}