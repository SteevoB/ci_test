package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaclulatorTest {

    @Test
    public void add(){
        //Given

        Calculator calculator = new Calculator();
        int a = 3;
        int b = 6;

        //When

        int result = calculator.add(a, b);

        //Then

        assertEquals(9, result);
    }
}
