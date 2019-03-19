package math;

/* Check out the return values, simple!!! */
/* This can be final */
final class ComplexZero extends Complex {
    static final Complex INSTANCE = new ComplexZero();

    private ComplexZero() {
        super(0, 0);
    }

    @Override
    public double getRealPart() {
        return 0;
    }

    @Override
    public double getImaginaryPart() {
        return 0;
    }

    @Override
    public Complex plus(Complex c) {
        return c;
    }

    @Override
    public Complex subtract(Complex c) {
        return Complex.valueOf(-c.re, -c.im);
    }

    @Override
    public Complex multiply(Complex c) {
        return this;
    }

    @Override
    public Complex divide(Complex c) {
        if (c == this) {
            //add support for the (NaN + NaNi) Class
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        return o == this;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "(0.0 + 0.0i)";
    }
}
