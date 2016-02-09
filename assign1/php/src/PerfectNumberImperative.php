<?php
class PerfectNumberImperative {
    function isFactor($number, $potentialFactor)
    {
        return $number % $potentialFactor == 0;
    }
    
    function getAllFactors($number)
    {
        $factors = array();
        
        for($i = 1; $i <= $number; $i++)
        {
            if($this->isFactor($number, $i))
            {
                array_push($factors, $i);
            }
        }
        
        return $factors;
    }
    
    function isPerfectNumber($number) {
        if($number < 6) {
            return false;
        }
        
        $factors = $this->getAllFactors($number);
        
        return array_sum($factors) == $number * 2;
    }
}
