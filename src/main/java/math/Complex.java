package math;

/* Don't set the class to final. Use package protected constructor instead */
public class Complex {
    public static final Complex ZERO = ComplexZero.INSTANCE;
    public static final Complex ONE = ComplexOne.INSTANCE;
    
    //Use constant classes instead
    public static final Complex MINUS_ONE = new Complex(-1, 0);
    public static final Complex I = new Complex(0, 1);
    public static final Complex MINUS_I = new Complex(0, -1);

    private final double re;
    private final double im;

    public static Complex valueOf(double re, double im) {
        if (re == 0.0 && im == 0.0) {
            return ComplexZero.ZERO;
        }
        if (re == 1.0 && im == 0.0) {
            return ComplexZero.ONE;
        }
        // Create separate class for MINUS_ONE, I and MINUS_I as well and implement custom methods for them
        
        return new Complex(re, im);
    }
    
    Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    // Accessors with no corresponding mutators, prefixed with get!!!
    public double getRealPart() {
        return re;
    }

    public double getImaginaryPart() {
        return im;
    }

    public Complex plus(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    public Complex subtract(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    public Complex multiply(Complex c) {
        return new Complex(re * c.re - im * c.im, re * c.im + im * c.re);
    }

    public Complex divide(Complex c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im) / tmp, (im * c.re - re
                * c.im)
                / tmp);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Complex)) {
            return false;
        }
        Complex c = (Complex) o;

        // See page 43 to find out why we use compare instead of ==
        return Double.compare(re, c.re) == 0 && Double.compare(im, c.im) == 0;
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(re);
        result = 31 * result + Double.hashCode(im);
        return result;
    }

    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}