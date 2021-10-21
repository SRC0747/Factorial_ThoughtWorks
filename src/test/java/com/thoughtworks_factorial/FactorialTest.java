package com.thoughtworks_factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void factorialZero() {
        Factorial f = new Factorial();
        int expected = 1;
        int actual = f.fact(0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void factorialOne() {
        Factorial f = new Factorial();
        int expected = 1;
        int actual = f.fact(1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void factorialTwo() {
        Factorial f = new Factorial();
        int expected = 2;
        int actual = f.fact(2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void factorialFive() {
        Factorial f = new Factorial();
        int expected = 120;
        int actual = f.fact(5);
        Assertions.assertEquals(expected, actual);
    }
}