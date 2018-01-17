import codewars.UniqueChars;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UniqueCharsTest {

    ArrayList<String> example;

    @Before
    public void setUp() throws Exception {
        example = new ArrayList<>(Arrays.asList("k","m","n","c"));
    }

    @Test
    public void uniqueCharacters() throws Exception {
        assertEquals(example, UniqueChars.uniqueCharacters("kemence"));
    }

    //static method testnel classon keresztul meghivni a methodot
}