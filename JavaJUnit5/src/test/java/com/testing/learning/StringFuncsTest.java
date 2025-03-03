package com.testing.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringFuncsTest {
    StringFuncs rs = new StringFuncs();

    @Test
    void reverseString_OneWord() {
        assertEquals("avaJ", rs.reverseString("Java"));
    }

    @Test
    void reverseString_MultipleWord() {
        assertEquals("ysae si avaJ", rs.reverseString("Java is easy"));
    }
}