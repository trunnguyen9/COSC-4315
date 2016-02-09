package assignment1;

import java.util.*;

public class PerfectNumberImperative {
    boolean isFactor(int number, int potentialFactorOfNumber)
    {
        return number % potentialFactorOfNumber == 0;
    }
    
    Set<Integer> getAllFactors(int number)
    {
        Set<Integer> factors = new HashSet<>();
        
        for(int i = 1; i <= number / 2; i++)
        {
            if(isFactor(number, i))
            {
                factors.add(i);
                factors.add(number / i);
            }
        }
        
        return factors;
    }
    
    int sumOfCollection(Set<Integer> collection)
    {
        int sum = 0;
        
        for(int e : collection)
        {
            sum += e;
        }
        
        return sum;
    }
    
    boolean isPerfectNumber(int number)
    {
        if(number < 6)
        {
            return false;
        } 
        
        Set<Integer> allFactors = getAllFactors(number);
        
        return sumOfCollection(allFactors) == number * 2;
    }
}
