package math;

/**
 * @author bjorn
 * @since 2019-04-01
 */
public abstract class Complex {
    public static Complex ZERO = ComplexZero.INSTANCE;
    public static Complex ONE = ComplexOne.INSTANCE;
    public static Complex MINUS_ONE = ComplexMinusOne.INSTANCE;
    public static Complex I = ComplexI.INSTANCE;
    public static Complex MINUS_I = ComplexMinusI.INSTANCE;

    public static Complex valueOf(double re, double im) {
        if (re == 0.0) {
            if (im == 0.0) {
                return ZERO;
            }
            if (im == 1.0) {
                return I;
            }
            if (im == -1.0) {
                return MINUS_I;
            }
        }

        if (im == 0.0) {
            if (re == 1.0) {
                return ONE;
            }
            if (re == -1.0) {
                return MINUS_ONE;
            }
        }

        return new ComplexImpl(re, im);
    }

    public abstract double getRealPart();

    public abstract double getImaginaryPart();

    public abstract Complex plus(Complex c);

    public abstract Complex subtract(Complex c);

    public abstract Complex multiply(Complex c);

    public abstract Complex divide(Complex c);

    @Override
    public boolean equals(Object o) {
        return o == this;
    }
}
