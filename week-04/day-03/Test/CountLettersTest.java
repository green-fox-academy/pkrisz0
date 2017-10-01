import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {

    CountLetters test = new CountLetters("bambamarha");

    @Test
    public void mapMaker() throws Exception {
        assertEquals(4,test.mapMaker("bambamarha").get('a'));
    }

}