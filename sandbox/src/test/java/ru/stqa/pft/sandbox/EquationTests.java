package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationTests {
    @Test
    public void test0() {
        Equation formula = new Equation(1,1,1);
        Assert.assertEquals(formula.rootNumber(),0);
    }
    @Test
    public void test1() {
        Equation formula1 = new Equation(1,2,1);
        Assert.assertEquals(formula1.rootNumber(),1);
    }
    @Test
    public void test2() {
        Equation formula1 = new Equation(1,5,6);
        Assert.assertEquals(formula1.rootNumber(),2);
    }
}
