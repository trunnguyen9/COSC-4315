package assignment1;

import java.util.*;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PerfectNumberImperativeTest {
    PerfectNumberImperative perfectNumber = new PerfectNumberImperative();
    
    @Test
    public void testGetFactorsOfNumberTwo()
    {
        int number = 2;
        Set<Integer> expectedFactors = new HashSet<Integer>(Arrays.asList(1, 2));
        
        assertArrayEquals(expectedFactors.toArray(), perfectNumber.getAllFactors(number).toArray());
    }
    
    @Test
    public void testGetFactorsOfNumberFour()
    {
        int number = 4;
        Set<Integer> expectedFactors = new HashSet<Integer>(Arrays.asList(1, 2, 4));
        
        assertArrayEquals(expectedFactors.toArray(), perfectNumber.getAllFactors(number).toArray());
    }
    
    @Test
    public void testGetFactorsOfNumberSix()
    {
        int number = 6;
        Set<Integer> expectedFactors = new HashSet<Integer>(Arrays.asList(1, 2, 3, 6));
        
        assertArrayEquals(expectedFactors.toArray(), perfectNumber.getAllFactors(number).toArray());
    }
    
    @Test
    public void testPerfectNumber6()
    {
        assertTrue(perfectNumber.isPerfectNumber(6));
    }
    
    @Test
    public void testPerfectNumber28()
    {
        assertTrue(perfectNumber.isPerfectNumber(28));
    }
    
    @Test
    public void testNotPerfectNumber29()
    {
        assertFalse(perfectNumber.isPerfectNumber(29));
    }
    
    @Test
    public void testNotPerfectNumber0()
    {
         assertFalse(perfectNumber.isPerfectNumber(0));
    }
    
    @Test
    public void testNotPerfectNumber1()
    {
         assertFalse(perfectNumber.isPerfectNumber(1));
    }
    
    @Test
    public void testNotPerfectNumberNegative6()
    {
         assertFalse(perfectNumber.isPerfectNumber(-6));
    }
}
