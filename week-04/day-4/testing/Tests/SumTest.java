import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void Sum_OutPut_ReturnsSum (){
        Sum sumTest = new Sum();
        ArrayList <Integer> testNumbers = new ArrayList(Arrays.asList(new Integer[]{1,3,6,8}));

        Integer sum = sumTest.sum(testNumbers);

        assertEquals((Integer)18, sum);

    }
    @Test
    public void Sum_OneElementList_ReturnsSum (){
        Sum sumTest = new Sum();
        ArrayList <Integer> testNumbers = new ArrayList(Arrays.asList(new Integer[]{1}));

        Integer sum = sumTest.sum(testNumbers);

        assertEquals((Integer)1, sum);
    }
    @Test
    public void Sum_NoElementList_ReturnsSum (){
        Sum sumTest = new Sum();
        ArrayList <Integer> testNumbers = new ArrayList(Arrays.asList(new Integer[]{}));

        Integer sum = sumTest.sum(testNumbers);

        assertEquals((Integer)0, sum);
    }

    @Test
    public void Sum_NullElement_ReturnsSum (){
        Sum sumTest = new Sum();
        ArrayList <Integer> testNumbers = null;

        Integer sum = sumTest.sum(testNumbers);

        assertEquals((Integer) 0, sum);
    }

}
