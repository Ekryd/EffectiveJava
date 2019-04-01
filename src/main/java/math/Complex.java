package math;

/**
 * @author bjorn
 * @since 2019-04-01
 */
public interface Complex {
    Complex ZERO = ComplexZero.INSTANCE;
    Complex ONE = ComplexOne.INSTANCE;

    Complex MINUS_ONE = new ComplexImpl(-1, 0);
    Complex I = new ComplexImpl(0, 1);
    Complex MINUS_I = new ComplexImpl(0, -1);

    static Complex valueOf(double re, double im) {
        /* Add handling of -0.0 */
        if (re == 0.0 && im == 0.0) {
            return ZERO;
        }
        if (re == 1.0 && im == 0.0) {
            return ONE;
        }
        if (re == -1.0 && im == 0.0) {
            return MINUS_ONE;
        }
        if (re == 0.0 && im == 1.0) {
            return I;
        }
        if (re == 0.0 && im == -1.0) {
            return MINUS_I;
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
