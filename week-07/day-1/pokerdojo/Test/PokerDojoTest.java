import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class PokerDojoTest {

    @Test
    public void checkHighHand_Output_TwoCardNumberIsEqual() {
        String[] hand1 = {"2D", "3D", "4D", "5D", "6D"};
        String[] hand2 = {"2D", "3D", "4D", "5D", "7D"};
        String result = PokerDojoMain.checkHighHand(hand1, hand2);

        assertEquals(result, "The two hand is equal.");
    }

    @Test
    public void checkHighHand_Output_Hand1HighCard() {
        String[] hand1 = {"3D", "3D", "4D", "5D", "9D"};
        String[] hand2 = {"2D", "3D", "4D", "5D", "7D"};
        String result = PokerDojoMain.checkHighHand(hand1, hand2);

        assertEquals(result, "Hand1 is the winner.");

    }

    @Test
    public void checkHighHand_Output_Hand2HighCard() {
        String[] hand1 = {"3D", "3D", "4D", "5D", "6D"};
        String[] hand2 = {"2D", "3D", "8D", "5D", "7D"};
        String result = PokerDojoMain.checkHighHand(hand1, hand2);

        assertEquals(result, "Hand2 is the winner.");

    }
}
