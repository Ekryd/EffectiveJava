package math;

/* This can be final */
final class ComplexOne extends Complex {
    static final Complex INSTANCE = new ComplexOne();

    private ComplexOne() {
        super(1, 0);
    }

    @Override
    public double getRealPart() {
        return 1;
    }

    @Override
    public double getImaginaryPart() {
        return 0;
    }

    @Override
    public Complex plus(Complex c) {
        return Complex.valueOf(1 + c.re, c.im);
    }

    @Override
    public Complex subtract(Complex c) {
        return Complex.valueOf(1 - c.re, -c.im);
    }

    @Override
    public Complex multiply(Complex c) {
        return Complex.valueOf(c.re, c.im);
    }

    @Override
    public Complex divide(Complex c) {
        double tmp = c.re * c.re + c.im * c.im;
        return Complex.valueOf(
                (c.re) / tmp,
                (-c.im) / tmp);
    }

    @Override
    public boolean equals(Object o) {
        return this == o;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "(1.0 + 0.0i)";
    }
}
