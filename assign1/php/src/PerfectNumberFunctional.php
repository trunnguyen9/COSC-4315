<?php

class PerfectNumberFunctional {
              
    function isPerfectNumber($number) {
        if($number < 6) {
            return false;
        }         
        $sequenceNumbers = range(1, $number);        
        $factorNumbersList = array_filter($sequenceNumbers, function($element) use ($number) {return $number % $element == 0;});
        return array_sum($factorNumbersList) == $number * 2;
    }
}

