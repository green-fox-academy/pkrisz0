import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    Anagram test = new Anagram();

    @Test
    public void anagramChecker() throws Exception {
        //assertEquals(true, test.anagramChecker()); or like this:
        assertTrue(test.anagramChecker("mozi","izom"));
    }

    @Test
    public void anagramCheckerTwo() throws Exception {
        //assertEquals(true, test.anagramChecker()); or like this:
        assertFalse(test.anagramChecker("kommunistamanifest","izom"));
    }

}

