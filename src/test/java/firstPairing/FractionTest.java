package firstPairing;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

final class FractionTest {

    @Test
    void constructorOneArgumentShouldCreateNewInstanceWhenInvoked() {

        assertDoesNotThrow(() -> new Fraction(-1_000_000_000_000L));
        assertDoesNotThrow(() -> new Fraction(-0L));
        assertDoesNotThrow(() -> new Fraction(0L));
        assertDoesNotThrow(() -> new Fraction(1_000_000_000_000L));
    }

    @Test
    void constructorTwoArgumentsShouldCreateNewInstanceWhenInvoked() {

        assertThrows(IllegalArgumentException.class, () -> new Fraction(0L, 0L));
        assertThrows(IllegalArgumentException.class, () -> new Fraction(5L, 0L));

        assertDoesNotThrow(() -> new Fraction(-0L, 1_000_000_000_000L));
        assertDoesNotThrow(() -> new Fraction(5L, -1_000_000_000_000L));
        assertDoesNotThrow(() -> new Fraction(-3L, 9L));
        assertDoesNotThrow(() -> new Fraction(-5L, -10L));
        assertDoesNotThrow(() -> new Fraction(9L, 3L));
    }

    @Test
    void addShouldWorkWhenAddingTwoFractions() {

        {
            final Fraction fraction1 = new Fraction(5L, 10L);
            final Fraction fraction2 = new Fraction(2L, 3L);

            final Fraction actual = fraction1.add(fraction2);
            assertEquals(new Fraction(7L, 6L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(-5L, 10L);
            final Fraction fraction2 = new Fraction(2L, 3L);

            final Fraction actual = fraction1.add(fraction2);
            assertEquals(new Fraction(1L, 6L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(5L, -10L);
            final Fraction fraction2 = new Fraction(2L, 3L);

            final Fraction actual = fraction1.add(fraction2);
            assertEquals(new Fraction(1L, 6L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(-5L, -10L);
            final Fraction fraction2 = new Fraction(2L, 3L);

            final Fraction actual = fraction1.add(fraction2);
            assertEquals(new Fraction(7L, 6L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(5L, 5L);
            final Fraction fraction2 = new Fraction(2L, 3L);

            final Fraction actual = fraction1.add(fraction2);
            assertEquals(new Fraction(5L, 3L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(5L, 10L);
            final Fraction fraction2 = new Fraction(2L, 2L);

            final Fraction actual = fraction1.add(fraction2);
            assertEquals(new Fraction(3L, 2L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(5L, 5L);
            final Fraction fraction2 = new Fraction(2L, 2L);

            final Fraction actual = fraction1.add(fraction2);
            assertEquals(new Fraction(2L, 1L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(1L, 64L);
            final Fraction fraction2 = new Fraction(1L, 128L);

            final Fraction actual = fraction1.add(fraction2);
            assertEquals(new Fraction(3L, 128L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(-5L, 10L);
            final Fraction fraction2 = new Fraction(1L, 10L);

            final Fraction actual = fraction1.add(fraction2);
            assertEquals(new Fraction(-4L, 10L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(5L, -10L);
            final Fraction fraction2 = new Fraction(1L, 10L);

            final Fraction actual = fraction1.add(fraction2);
            assertEquals(new Fraction(-4L, 10L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(-5L, -10L);
            final Fraction fraction2 = new Fraction(1L, 10L);

            final Fraction actual = fraction1.add(fraction2);
            assertEquals(new Fraction(6L, 10L), actual);
        }
    }

    @Test
    void subtractShouldWorkWhenSubbingTwoFractions() {
        {
            final Fraction fraction1 = new Fraction(5L, 10L);
            final Fraction fraction2 = new Fraction(2L, 3L);

            final Fraction actual = fraction1.subtract(fraction2);
            assertEquals(new Fraction(-1L, 6L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(-5L, 10L);
            final Fraction fraction2 = new Fraction(2L, 3L);

            final Fraction actual = fraction1.subtract(fraction2);
            assertEquals(new Fraction(-7L, 6L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(5L, -10L);
            final Fraction fraction2 = new Fraction(2L, 3L);

            final Fraction actual = fraction1.subtract(fraction2);
            assertEquals(new Fraction(-7L, 6L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(-5L, -10L);
            final Fraction fraction2 = new Fraction(2L, 3L);

            final Fraction actual = fraction1.subtract(fraction2);
            assertEquals(new Fraction(-1L, 6L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(5L, 5L);
            final Fraction fraction2 = new Fraction(2L, 3L);

            final Fraction actual = fraction1.subtract(fraction2);
            assertEquals(new Fraction(1L, 3L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(5L, 10L);
            final Fraction fraction2 = new Fraction(2L, 2L);

            final Fraction actual = fraction1.subtract(fraction2);
            assertEquals(new Fraction(-1L, 2L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(5L, 5L);
            final Fraction fraction2 = new Fraction(2L, 2L);

            final Fraction actual = fraction1.subtract(fraction2);
            assertEquals(new Fraction(0), actual);
        }

        {
            final Fraction fraction1 = new Fraction(1L, 64L);
            final Fraction fraction2 = new Fraction(1L, 128L);

            final Fraction actual = fraction1.subtract(fraction2);
            assertEquals(new Fraction(1L, 128L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(-5L, 10L);
            final Fraction fraction2 = new Fraction(1L, 10L);

            final Fraction actual = fraction1.subtract(fraction2);
            assertEquals(new Fraction(-3L, 5L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(5L, -10L);
            final Fraction fraction2 = new Fraction(1L, 10L);

            final Fraction actual = fraction1.subtract(fraction2);
            assertEquals(new Fraction(-3L, 5L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(-5L, -10L);
            final Fraction fraction2 = new Fraction(1L, 10L);

            final Fraction actual = fraction1.subtract(fraction2);
            assertEquals(new Fraction(2L, 5L), actual);
        }

    }

    @Test
    void multiplyShouldWorkWhenMultiplyingTwoFractions() {
        {
            final Fraction fraction1 = new Fraction(5L, 10L);
            final Fraction fraction2 = new Fraction(2L, 3L);

            final Fraction actual = fraction1.multiply(fraction2);
            assertEquals(new Fraction(1L, 3L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(-5L, 10L);
            final Fraction fraction2 = new Fraction(2L, 3L);

            final Fraction actual = fraction1.multiply(fraction2);
            assertEquals(new Fraction(-1L, 3L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(5L, -10L);
            final Fraction fraction2 = new Fraction(2L, 3L);

            final Fraction actual = fraction1.multiply(fraction2);
            assertEquals(new Fraction(-1L, 3L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(-5L, -10L);
            final Fraction fraction2 = new Fraction(2L, 3L);

            final Fraction actual = fraction1.multiply(fraction2);
            assertEquals(new Fraction(1L, 3L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(5L, 5L);
            final Fraction fraction2 = new Fraction(2L, 3L);

            final Fraction actual = fraction1.multiply(fraction2);
            assertEquals(new Fraction(2L, 3L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(5L, 10L);
            final Fraction fraction2 = new Fraction(2L, 2L);

            final Fraction actual = fraction1.multiply(fraction2);
            assertEquals(new Fraction(1L, 2L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(5L, 5L);
            final Fraction fraction2 = new Fraction(2L, 2L);

            final Fraction actual = fraction1.multiply(fraction2);
            assertEquals(new Fraction(1L, 1L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(1L, 64L);
            final Fraction fraction2 = new Fraction(1L, 128L);

            final Fraction actual = fraction1.multiply(fraction2);
            assertEquals(new Fraction(1L, 8192L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(-5L, 10L);
            final Fraction fraction2 = new Fraction(1L, 10L);

            final Fraction actual = fraction1.multiply(fraction2);
            assertEquals(new Fraction(-1L, 20L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(5L, -10L);
            final Fraction fraction2 = new Fraction(1L, 10L);

            final Fraction actual = fraction1.multiply(fraction2);
            assertEquals(new Fraction(-1L, 20L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(-5L, -10L);
            final Fraction fraction2 = new Fraction(1L, 10L);

            final Fraction actual = fraction1.multiply(fraction2);
            assertEquals(new Fraction(1L, 20L), actual);
        }
    }

    @Test
    void divideShouldWorkWhenDividingTwoFractions() {
        {
            final Fraction fraction1 = new Fraction(5L, 10L);
            final Fraction fraction2 = new Fraction(2L, 3L);

            final Fraction actual = fraction1.divide(fraction2);
            assertEquals(new Fraction(3L, 4L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(-5L, 10L);
            final Fraction fraction2 = new Fraction(2L, 3L);

            final Fraction actual = fraction1.divide(fraction2);
            assertEquals(new Fraction(-3L, 4L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(5L, -10L);
            final Fraction fraction2 = new Fraction(2L, 3L);

            final Fraction actual = fraction1.divide(fraction2);
            assertEquals(new Fraction(-3L, 4L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(-5L, -10L);
            final Fraction fraction2 = new Fraction(2L, 3L);

            final Fraction actual = fraction1.divide(fraction2);
            assertEquals(new Fraction(3L, 4L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(5L, 5L);
            final Fraction fraction2 = new Fraction(2L, 3L);

            final Fraction actual = fraction1.divide(fraction2);
            assertEquals(new Fraction(3L, 2L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(5L, 10L);
            final Fraction fraction2 = new Fraction(2L, 2L);

            final Fraction actual = fraction1.divide(fraction2);
            assertEquals(new Fraction(1L, 2L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(5L, 5L);
            final Fraction fraction2 = new Fraction(2L, 2L);

            final Fraction actual = fraction1.divide(fraction2);
            assertEquals(new Fraction(1L, 1L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(1L, 64L);
            final Fraction fraction2 = new Fraction(1L, 128L);

            final Fraction actual = fraction1.divide(fraction2);
            assertEquals(new Fraction(2L, 1L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(-5L, 10L);
            final Fraction fraction2 = new Fraction(1L, 10L);

            final Fraction actual = fraction1.divide(fraction2);
            assertEquals(new Fraction(-5L, 1L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(5L, -10L);
            final Fraction fraction2 = new Fraction(1L, 10L);

            final Fraction actual = fraction1.divide(fraction2);
            assertEquals(new Fraction(-5L, 1L), actual);
        }

        {
            final Fraction fraction1 = new Fraction(-5L, -10L);
            final Fraction fraction2 = new Fraction(1L, 10L);

            final Fraction actual = fraction1.divide(fraction2);
            assertEquals(new Fraction(5L, 1L), actual);
        }
    }

    @Test
    void negateShouldNegateFractionWhenCall() {
        {
            final Fraction expected = new Fraction(-1L, 2L);
            final Fraction actual = new Fraction(1L, 2L).negate();
            assertEquals(expected, actual);
        }

        {
            final Fraction expected = new Fraction(1L, -2L);
            final Fraction actual = new Fraction(1L, 2L).negate();
            assertEquals(expected, actual);
        }

        {
            final Fraction expected = new Fraction(-1L, -2L);
            final Fraction actual = new Fraction(-1L, 2L).negate();
            assertEquals(expected, actual);
        }

        {
            final Fraction expected = new Fraction(-1L, -2L);
            final Fraction actual = new Fraction(1L, -2L).negate();
            assertEquals(expected, actual);
        }

        {
            final Fraction expected = new Fraction(1L, -2L);
            final Fraction actual = new Fraction(-1L, -2L).negate();
            assertEquals(expected, actual);
        }
    }

    @Test
    void byteValueShouldReturnCorrectByteValueWhenCalled() {
        assertEquals(0, new Fraction(1L, 2L).byteValue());
        assertEquals(127, new Fraction(127L, 1L).byteValue());
        assertEquals(-128, new Fraction(-128L, 1L).byteValue());
        // number exceed -128 and 127
    }

    @Test
    void shortValueShouldReturnCorrectShortValueWhenCalled() {

        assertEquals(-32768, new Fraction(-98304L, 3L).shortValue());
        assertEquals(32767, new Fraction(131068L, 4L).shortValue());
    }

    @Test
    void intValueShouldReturnCorrectIntValueWhenCalled() {
        assertEquals(5, new Fraction(26L, 5L).intValue());
        assertEquals(-4, new Fraction(-24L, 5L).intValue());
        assertEquals(2_000_000_000, new Fraction(4_000_000_000L, 2L).intValue());
        assertEquals(-2_000_000_000, new Fraction(-6_000_000_000L, 3L).intValue());
        assertEquals(0, new Fraction(0L, 50L).intValue());
    }

    @Test
    void longValueShouldReturnCorrectLongValueWhenCalled() {
        assertEquals(2_000_000_000_000L, new Fraction(8_000_000_000_000L, 4).longValue());

    }

    @Test
    void floatValueShouldReturnCorrectFloatValueWhenCalled() {
        assertEquals(1.6666666f, new Fraction(5L, 3L).floatValue());
    }

    @Test
    void doubleValueShouldReturnCorrectDoubleValueWhenCalled() {

        assertEquals(0.5D, new Fraction(1L, 2L).doubleValue());
    }

    @Test
    void compareToShouldReturnCorrectResultWhenCompareFractions() {

        {
            final Fraction fraction1 = new Fraction(-1L, -2L);
            final Fraction fraction2 = new Fraction(1L, -2L);
            assertTrue(fraction1.compareTo(fraction2) > 0);
            assertTrue(fraction2.compareTo(fraction1) < 0);
        }

        {
            final Fraction fraction1 = new Fraction(1L, 2L);
            final Fraction fraction2 = new Fraction(1L, -2L);
            assertTrue(fraction1.compareTo(fraction2) > 0);
            assertTrue(fraction2.compareTo(fraction1) < 0);
        }

        {
            final Fraction fraction1 = new Fraction(1L, 2L);
            final Fraction fraction2 = new Fraction(-1L, 2L);
            assertTrue(fraction1.compareTo(fraction2) > 0);
            assertTrue(fraction2.compareTo(fraction1) < 0);
        }

        {
            final Fraction fraction1 = new Fraction(1L, 2L);
            final Fraction fraction2 = new Fraction(-1L, -2L);
            assertEquals(0, fraction1.compareTo(fraction2));
            assertEquals(0, fraction2.compareTo(fraction1));
        }

        {
            final Fraction fraction1 = new Fraction(1L, 2L);
            final Fraction fraction2 = new Fraction(2L, 4L);
            assertEquals(0, fraction1.compareTo(fraction2));
            assertEquals(0, fraction2.compareTo(fraction1));
        }

        {
            final Fraction fraction1 = new Fraction(1L, 2L);
            final Fraction fraction2 = null;
            assertTrue(fraction1.compareTo(fraction2) > 0);
        }
    }

    @Test
    void equalsAndHashcodeShouldObeyContract() {
        EqualsVerifier.forClass(Fraction.class).verify();
    }

    @Test
    void toStringShouldHaveCustomImplementation() {

        final Fraction subjectUnderTest = new Fraction(1L);

        assertFalse(subjectUnderTest.toString().contains(Integer.toHexString(subjectUnderTest.hashCode())));
    }
}
