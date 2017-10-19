import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    Deck test = new Deck();

    @Test
    public void deckTest(){
        assertEquals(52, test.size());
    }

    @Test
    public void deckTest2(){
        int hearts = 0;
        for (int i = 0; i < test.size(); i++) {
            if (String.valueOf(test.get(i).charAt(0)).equals("H")){
                hearts++;
            }
        }
        assertEquals(13, hearts);
    }
}