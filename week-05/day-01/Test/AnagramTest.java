import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    Anagram testMe = new Anagram();
    @Test
    public void anagram() throws Exception {
        assertFalse(testMe.anagram("a","b"));
    }

    @Test
    public void anagram2() throws Exception {
        assertTrue(testMe.anagram("a","a"));
    }

    @Test
    public void anagram3() throws Exception {
        assertTrue(testMe.anagram("mozi","izom"));
    }

}