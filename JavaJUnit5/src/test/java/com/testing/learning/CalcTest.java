package com.testing.learning;

import org.junit.Test;

import static org.junit.Assert.*;
public class CalcTest {

    @Test
    public void test() {

    }

    @Test
    public void divide() {
        Calc c = new Calc();
        assertEquals(4, c.divide(8, 2));
    }
}