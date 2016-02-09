<?php
require_once(realpath(dirname(__FILE__) . '/../src/PerfectNumberFunctional.php'));

class PerfectNumberFunctionalTest extends PHPUnit_Framework_TestCase {
    
    protected $object;
    
    protected function setUp() {
        $this->object = new PerfectNumberFunctional;
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
