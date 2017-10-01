import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

    /**
     * Created by aze on 2017.04.04..
     */

    class ExtensionTest {

        Extension extension = new Extension();

        @Test
        void testAdd_2and3is5() {
            assertEquals(6, extension.add(3, 3));
        }

        @Test
        void testAdd_1and4is5() {
            assertEquals(5, extension.add(1, 4));
        }

        @Test
        void testMaxOfThree_first() {
            assertEquals(30, extension.maxOfThree(19, 11, 30));
        }

        @Test
        void testMaxOfThree_third() {
            assertEquals(5, extension.maxOfThree(3, 4, 5));
        }

        @Test
        void testMedian_four() {
            assertEquals(6.5, extension.median(Arrays.asList(5, 6, 7, 8)));
        }

        @Test
        void testMedian_five() {
            assertEquals(3, extension.median(Arrays.asList(5,2,4,3,1)));
        }

        @Test
        void testIsVowel_a() {
            assertTrue(extension.isVowel('o'));
        }

        @Test
        void testIsVowel_u() {
            assertTrue(extension.isVowel('u'));
        }

        @Test
        void testTranslate_bemutatkozik() {
            assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
        }

        @Test
        void testTranslate_kolbice() {
            assertEquals("lavagovopuvus", extension.translate("lagopus"));
        }
    }

