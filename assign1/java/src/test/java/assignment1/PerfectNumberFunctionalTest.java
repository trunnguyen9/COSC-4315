package assignment1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PerfectNumberFunctionalTest {
    PerfectNumberFunctional perfectNumber = new PerfectNumberFunctional();
    
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
