package math;

/* Don't set the class to final. Use package protected constructor instead */
class ComplexImpl extends Complex {

    private final double re;
    private final double im;

    ComplexImpl(double re, double im) {
        super();
        this.re = re;
        this.im = im;
    }

    public double getRealPart() {
        return re;
    }

    public double getImaginaryPart() {
        return im;
    }


    @Override
    public Complex plus(Complex c) {
        return Complex.valueOf(re + c.getRealPart(), im + c.getImaginaryPart());
    }

    @Override
    public Complex subtract(Complex c) {
        return Complex.valueOf(re - c.getRealPart(), im - c.getImaginaryPart());
    }

    @Override
    public Complex multiply(Complex c) {
        return Complex.valueOf(re * c.getRealPart() - im * c.getImaginaryPart(), re * c.getImaginaryPart() + im * c.getRealPart());
    }

    @Override
    public Complex divide(Complex c) {
        double tmp = c.getRealPart() * c.getRealPart() + c.getImaginaryPart() * c.getImaginaryPart();
        return Complex.valueOf(
                (re * c.getRealPart() + im * c.getImaginaryPart()) / tmp,
                (im * c.getRealPart() - re * c.getImaginaryPart()) / tmp);
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
        return Double.compare(re, c.getRealPart()) == 0 && Double.compare(im, c.getImaginaryPart()) == 0;
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