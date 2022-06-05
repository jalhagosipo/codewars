package kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    public void test1() {
        assertEquals(-42, Kata.makeNegative(42));
        assertEquals(-1, Kata.makeNegative(1));
        assertEquals(-5, Kata.makeNegative(-5));
        assertEquals(0, Kata.makeNegative(0));
    }

    @Test
    public void tests() {
        assertEquals(-1, Kata.opposite(1));
    }
}