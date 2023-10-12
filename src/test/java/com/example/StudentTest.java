package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test
    public void testStudentInitialization() {
        Student student = new Student("John Doe", 1);
        assertEquals("John Doe", student.getName());
        assertEquals(1, student.getId());
    }

}
