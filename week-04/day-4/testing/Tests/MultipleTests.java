import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

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

    @Test
    public void CountLettersTest_Output_OnlyUniqueChars(){
        HashMap<Character, Integer> testOutputMap = new HashMap<>();

        String inputString = "input";

        testOutputMap.put('i', 1);
        testOutputMap.put('n', 1);
        testOutputMap.put('p', 1);
        testOutputMap.put('u', 1);
        testOutputMap.put('t', 1);

        CountLetters testMethod = new CountLetters();
        assertEquals(testOutputMap, testMethod.countLetters(inputString));
    }
    @Test
    public void CountLettersTest_Output_EveryCharDoubles(){
        HashMap<Character, Integer> testOutputMap = new HashMap<>();

        String inputString = "inputinput";

        testOutputMap.put('i', 2);
        testOutputMap.put('n', 2);
        testOutputMap.put('p', 2);
        testOutputMap.put('u', 2);
        testOutputMap.put('t', 2);


        CountLetters testMethod = new CountLetters();
        assertEquals(testOutputMap, testMethod.countLetters(inputString));
    }
    @Test
    public void CountLettersTest_Output_EveryCharDoublesWithSpace(){
        HashMap<Character, Integer> testOutputMap = new HashMap<>();

        String inputString = "input input";

        testOutputMap.put('i', 2);
        testOutputMap.put('n', 2);
        testOutputMap.put('p', 2);
        testOutputMap.put('u', 2);
        testOutputMap.put('t', 2);
        testOutputMap.put(' ', 1);


        CountLetters testMethod = new CountLetters();
        assertEquals(testOutputMap, testMethod.countLetters(inputString));
    }

    @Test
    public void FibonacciTest_FibNumber_Index5(){
        int index =5;
        assertEquals((Integer)5, (Integer) Fibonacci.indexOfFib(index)); //itt Static method-ként hivatkoztam az indexOfFib-re
    }
    @Test
    public void FibonacciTest_FibNumber_Index0(){
        Fibonacci fibTest = new Fibonacci();
        int index =0;
        assertEquals((Integer)0, (Integer)fibTest.indexOfFib(index)); //itt pedig létrehoztam egy Fibonacci változót, de felesleges, mivel static, és nem kell belőle instance
    }




}
