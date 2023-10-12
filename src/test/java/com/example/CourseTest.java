package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourseTest {
    @Test
    public void testCourseInitializationAndEnrollment() {
        Course course = new Course("Math 101", "MATH101");
        assertEquals("Math 101", course.getCourseName());
        assertEquals("MATH101", course.getCourseID());

        Student student = new Student("John Doe", 1);
        course.enrollStudent(student);
        assertEquals(1, course.getStudents().size());
        assertEquals(student, course.getStudents().get(0));
    }
}
