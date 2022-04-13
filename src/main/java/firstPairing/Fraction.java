package firstPairing;

import com.google.common.base.Preconditions;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Functions: Implementation of Add, Subtract, Multiply and Divide
 */
public final class Fraction extends Number implements Comparable<Fraction> {

    private final long numerator;
    private final long denominator;
    private String dylan;


    /**
     * Represents the whole number as the fraction
     */
    public Fraction(final long numerator) {

        this(numerator, 1L);
    }

    /**
     * Represents the fraction with numerator/denominator
     * There will be an "Error" message returned if the denominator = 0
     */
    public Fraction(final long numerator, final long denominator) {

        Preconditions.checkArgument(denominator != 0, "The denominator cannot be 0");

        long gcd = gcd(numerator, denominator);

        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }


    /**
     * @return A new fraction will be created that is: this + fracToAdd
     */
    @NotNull
    public Fraction add(@NotNull final Fraction fracToAdd) {

        return new Fraction(
                numerator * fracToAdd.denominator + denominator * fracToAdd.numerator,
                denominator * fracToAdd.denominator
        );
    }

    /**
     * @return A new fraction will be created that is: this - fracToSub
     */
    @NotNull
    public Fraction subtract(@NotNull final Fraction fracToSub) {

        return add(fracToSub.negate());
    }

    /**
     * @return A new fraction will be created that is: this * fracToMultiply
     */
    @NotNull
    public Fraction multiply(@NotNull final Fraction fracToMultiply) {

        return new Fraction(
                numerator * fracToMultiply.numerator,
                denominator * fracToMultiply.denominator
        );
    }

    /**
     * @return A new fraction will be created that is: this / fracToDevide
     */
    @NotNull
    public Fraction divide(@NotNull final Fraction fracToDivide) {

        return multiply(fracToDivide.inverse());
    }

    /**
     * @return A new fraction will be created that is: 1/this
     */
    @NotNull
    public Fraction inverse() {

        return new Fraction(denominator, numerator);
    }

    /**
     * @return A new fraction will be created that is: - this
     */
    @NotNull
    public Fraction negate() {

        return new Fraction(-numerator, denominator);
    }

    @Override
    public byte byteValue() {
        return (byte) longValue();
    }

    @Override
    public short shortValue() {
        return (short) longValue();
    }

    @Override
    public int intValue() {
        return (int) longValue();

    }

    @Override
    public long longValue() {
        return numerator / denominator;

    }

    @Override
    public float floatValue() {
        return (float) doubleValue();

    }

    @Override
    public double doubleValue() {
        return (double) numerator / (double) denominator;

    }

    @Override
    public int compareTo(@Nullable final Fraction that) {

        if (that == null) {
            return 1;
        }
        if (equals(that)) {
            return 0;
        }
        final Long thisNumerator = this.numerator * that.denominator;
        final Long thatNumerator = that.numerator * this.denominator;

        return thatNumerator.compareTo(thisNumerator);
    }

    @Override
    public boolean equals(@Nullable final Object o) {

        if (o instanceof Fraction) {
            final Fraction that = (Fraction) o;
            return this.numerator == that.numerator &&
                    this.denominator == that.denominator;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);

    }

    @NotNull
    @Override
    public String toString() {
        return numerator + "/" + denominator;

    }

    /*
     * @return the Greatest Common Divisor of the two numbers
     */
    private long gcd(final long a, final long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
