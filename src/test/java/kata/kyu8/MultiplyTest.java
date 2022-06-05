package kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {
    @Test
    public void test_Associativity_Of_Multiplication() throws Exception {
        for (int i = 0; i < 100; i++) {
            Double a = Math.random();
            Double b = Math.random();
            assertEquals(a*b, Multiply.multiply(a, b));
        }
    }
}