package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    @Test
    public void testTriangleAreaAndPerimeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(6, triangle.area());
        assertEquals(12, triangle.perimeter());
    }

}
