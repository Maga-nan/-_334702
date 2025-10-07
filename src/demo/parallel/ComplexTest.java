package demo.parallel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void testPlus() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        a.plus(b);
        assertEquals(4, a.getRe(), 1e-9);
        assertEquals(6, a.getIm(), 1e-9);
    }

    @Test
    void testMinus() {
        Complex a = new Complex(5, 5);
        Complex b = new Complex(2, 3);
        a.minus(b);
        assertEquals(3, a.getRe(), 1e-9);
        assertEquals(2, a.getIm(), 1e-9);
    }

    @Test
    void testTimes() {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(4, -5);
        a.times(b);
        assertEquals(23, a.getRe(), 1e-9);
        assertEquals(2, a.getIm(), 1e-9);
    }

    @Test
    void testDivide() {
        Complex a = new Complex(3, 2);
        Complex b = new Complex(4, -1);
        a.divide(b);
        assertEquals(0.588, a.getRe(), 1e-3);
        assertEquals(0.647, a.getIm(), 1e-3);
    }
}
