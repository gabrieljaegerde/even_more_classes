package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    
    @Test
    public void testSquareArea() {
        Square square = new Square(4);
        assertEquals(16, square.area());
    }

    @Test
    public void testSquarePerimeter() {
        Square square = new Square(4);
        assertEquals(16, square.perimeter());
    }
}
