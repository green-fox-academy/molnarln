import dominoes.Domino;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sharpie.Sharpie;
import sharpie.SharpieSet;
import static org.junit.Assert.*;

public class SharpieTest {

    @Test
    public void Sharpie_NegativeWidth_Returnsnegative3(){

        Sharpie sharpie1 = new Sharpie("White", 2);

        SharpieSet setOfSharpiesTest = new SharpieSet();
        setOfSharpiesTest.add(sharpie1);
        sharpie1.use();

        assertEquals(-1.0, sharpie1.getInkAmount(), 0.01);
    }

}
