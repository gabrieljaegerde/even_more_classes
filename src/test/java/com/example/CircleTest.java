package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    
    @Test
    public void testCircleArea() {
        Circle circle = new Circle(5);
        assertEquals(Math.PI * 5 * 5, circle.area(), 0.001); // Using a delta for floating point comparison
    }

    @Test
    public void testCirclePerimeter() {
        Circle circle = new Circle(5);
        assertEquals(2 * Math.PI * 5, circle.perimeter(), 0.001);
    }
}
