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
        return new Complex(1 + c.getRealPart(), c.getImaginaryPart());
    }

    @Override
    public Complex subtract(Complex c) {
        return new Complex(1 - c.getRealPart(), -c.getImaginaryPart());
    }

    @Override
    public Complex multiply(Complex c) {
        return new Complex(c.getRealPart(), c.getImaginaryPart());
    }

    @Override
    public Complex divide(Complex c) {
        double tmp = c.getRealPart() * c.getRealPart() + c.getImaginaryPart() * c.getImaginaryPart();
        return new Complex((c.getRealPart()) / tmp, (-1 * c.getImaginaryPart()) / tmp);
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
        return "(1 + 0i)";
    }
}
