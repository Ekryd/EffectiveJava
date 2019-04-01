package math;

/* This can be final */
enum ComplexOne implements Complex {
    INSTANCE;

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
        return Complex.valueOf(1 + c.getRealPart(), c.getImaginaryPart());
    }

    @Override
    public Complex subtract(Complex c) {
        return Complex.valueOf(1 - c.getRealPart(), -c.getImaginaryPart());
    }

    @Override
    public Complex multiply(Complex c) {
        return Complex.valueOf(c.getRealPart(), c.getImaginaryPart());
    }

    @Override
    public Complex divide(Complex c) {
        double tmp = c.getRealPart() * c.getRealPart() + c.getImaginaryPart() * c.getImaginaryPart();
        return Complex.valueOf(
                (c.getRealPart()) / tmp,
                (-c.getImaginaryPart()) / tmp);
    }

    @Override
    public String toString() {
        return "(1.0 + 0.0i)";
    }
}
