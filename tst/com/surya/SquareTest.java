package com.surya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    public  void getSides() {
        Square square = new Square();
        Assertions.assertEquals(4, square.getSides());
    }
}