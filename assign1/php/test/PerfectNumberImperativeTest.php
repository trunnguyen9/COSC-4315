<?php
require_once(realpath(dirname(__FILE__) . '/../src/PerfectNumberImperative.php'));

class PerfectNumberImperativeTest extends PHPUnit_Framework_TestCase {
    protected $object;

    protected function setUp() {
        $this->object = new PerfectNumberImperative;
    }

    public function testGetAllFactorsNumber2() {
        $number = 2;
        $factors = array(1, 2);
        
        $this->assertTrue($factors == $this->object->getAllFactors($number));
    }
    
    public function testGetAllFactorsNumber4() {
        $number = 4;
        $factors = array(1, 2, 4);
        
        $this->assertTrue($factors == $this->object->getAllFactors($number));
    }
    
    public function testGetAllFactorsNumber6() {
        $number = 6;
        $factors = array(1, 2, 3, 6);
        
        $this->assertTrue($factors == $this->object->getAllFactors($number));
    }
    
    public function testIsPerfectNumber6() {
        $this->assertTrue($this->object->isPerfectNumber(6));
    }
    
    public function testIsPerfectNumber28() {
        $this->assertTrue($this->object->isPerfectNumber(28));
    }

    public function testIsNotPerfectNumber29() {
        $this->assertFalse($this->object->isPerfectNumber(29));
    }
    
    public function testIsNotPerfectNumber0() {
        $this->assertFalse($this->object->isPerfectNumber(0));
    }
    
    public function testIsNotPerfectNumber1() {
        $this->assertFalse($this->object->isPerfectNumber(1));
    }
    
    public function testIsNotPerfectNumberNegative6() {
        $this->assertFalse($this->object->isPerfectNumber(-6));
    }
}
