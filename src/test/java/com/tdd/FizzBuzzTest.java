package com.tdd;

import com.luv2code.junitdemo.FizzBuzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {
    //if number is divisible by 3, return "Fizz"
    //if number is divisible by 5, return "Buzz"
    //if number is divisible by 3 and 5, return "FizzBuzz"
    //if number is not divisible by 3 or 5, return the number

    @DisplayName("Divisible by 3")
    @Test
    void testForDivisibleByThree(){
        String expected = "Fizz";

        assertEquals(expected, FizzBuzz.compute(4),"Should return Fizz");

    }

}
