package javacode.Test;

import javacode.SimpleMath;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    private SimpleMath simpleMath;

    @Before
    public void setUp() throws Exception {
        simpleMath = new SimpleMath();
    }

    @After
    public void tearDown() throws Exception {
    }

    //provide an example test to see if subtraction method is okay

    @Test
    public void testSubtraction() {
        int result = simpleMath.subtraction(5,3);
        assertEquals(result,8);
    }
    //provide an example test to see if multiplication method is okay

    @Test
    public void testMultiplication() {
        int result = simpleMath.multiplication(10,4);
        assertEquals(result,40);
    }

    //Test if first variable is an integer
    @Test
    void testMinuendType(Integer minuend){
        Assertions.assertFalse(minuend != (int)minuend);
    }
    //Test if a second variable is an integer
    @Test
    void testSubtrahendType(Integer subtrahend){
        Assertions.assertFalse(subtrahend != (int)subtrahend);
    }

    //Test if first variable is an integer
    @Test
    void testMultiplier(Integer multiplier){
        Assertions.assertFalse(multiplier == (int)multiplier);
    }
    //Test if a second variable is an integer
    @Test
    void testMultiplicand(Integer multiplicand){
        Assertions.assertFalse(multiplicand == (int)multiplicand);
    }

}