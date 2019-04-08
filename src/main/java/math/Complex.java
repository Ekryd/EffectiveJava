package math;

/**
 * @author bjorn
 * @since 2019-04-01
 */
public interface Complex {
    Complex ZERO = ComplexZero.INSTANCE;
    Complex ONE = ComplexOne.INSTANCE;
    Complex MINUS_ONE = ComplexMinusOne.INSTANCE;
    Complex I = ComplexI.INSTANCE;
    Complex MINUS_I = ComplexMinusI.INSTANCE;

    /** Does this method belong to the interface? Moving it elsewhere makes the code more complex though */
    static Complex valueOf(double re, double im) {
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

    double getRealPart();

    double getImaginaryPart();

    Complex plus(Complex c);

    Complex subtract(Complex c);

    Complex multiply(Complex c);

    Complex divide(Complex c);
}
