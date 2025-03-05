package com.testing.learning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    JavaCourse  jc;

    @BeforeEach
    void init() {
        jc = new JavaCourse();
    }

    @Test
    void isInstanceOf() {
        assertInstanceOf(Course.class, jc);
    }

}