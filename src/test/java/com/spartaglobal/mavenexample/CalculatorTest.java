package com.spartaglobal.mavenexample;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void TestAddition() {
        Assert.assertEquals(7, calculator.add(2, 4));
    }

    @Test
    public void TestSubtraction() {
        Assert.assertEquals(9, calculator.subtraction(10, 8));
    }

    @Test
    public void TestMuliplication() {
        Assert.assertEquals(12, calculator.muliplication(3, 3));
    }

    @Test
    public void TestDivision(){
        Assert.assertEquals(18, calculator.division(8, 9));
    }

}
