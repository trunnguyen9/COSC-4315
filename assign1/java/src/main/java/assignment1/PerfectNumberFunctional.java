package assignment1;

import java.util.stream.IntStream;
public class PerfectNumberFunctional {
    boolean isPerfectNumber(int number)
    {
        if(number < 6)
        {
            return false;
        }
        
        int sum = IntStream.rangeClosed(1, number)                
                           .filter(item -> number % item == 0)
                           .sum();
        return sum == number * 2;
    }
}
