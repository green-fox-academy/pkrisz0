import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    Game test = new Game();

    @Test
    public void welcomeTest(){
        assertEquals("hello",test.welcome());
    }

    @Test
    public void highCard(){
        assertEquals("Black wins", test.evaluate());
    }

    @Test
    public void equalsTest() {
        ArrayList<String> hand = new ArrayList<>(Arrays.asList("C7", "H5", "H6", "SK", "C2"));
        assertEquals(12,test.getHighest(hand));
    }
}