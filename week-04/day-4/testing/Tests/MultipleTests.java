import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class MultipleTests {

    @Test
    public void AnagramTest_Output_DifferentInput (){
        Anagram anagramTest = new Anagram();

        String firstInput = "alma";
        String secondInput = "lama";


        assertEquals(true, anagramTest.isAnagram(firstInput, secondInput));

    }
    @Test
    public void AnagramTest_Output_DifferentInputLength (){
        Anagram anagramTest = new Anagram();

        String firstInput = "almas";
        String secondInput = "lama";


        assertEquals(false, anagramTest.isAnagram(firstInput, secondInput));

    }
    @Test
    public void AnagramTest_Output_NotAnagramsEqualLength (){
        Anagram anagramTest = new Anagram();

        String firstInput = "almo";
        String secondInput = "lama";


        assertEquals(false, anagramTest.isAnagram(firstInput, secondInput));

    }
    @Test
    public void AnagramTest_Output_EqualCharacter (){
        Anagram anagramTest = new Anagram();

        String firstInput = "aaaa";
        String secondInput = "aaaa";


        assertEquals(true, anagramTest.isAnagram(firstInput, secondInput));

    }




}
