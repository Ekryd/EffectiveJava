package math;

final class ComplexMinusI extends Complex {
    static final Complex INSTANCE = new ComplexMinusI();

    private ComplexMinusI() {
    }

    @Override
    public double getRealPart() {
        return 0;
    }

    @Override
    public double getImaginaryPart() {
        return -1;
    }

    @Override
    public Complex plus(Complex c) {
        return Complex.valueOf(c.getRealPart(), -1 + c.getImaginaryPart());
    }

    @Override
    public Complex subtract(Complex c) {
        return Complex.valueOf(-c.getRealPart(), -1 - c.getImaginaryPart());
    }

    @Override
    public Complex multiply(Complex c) {
        return Complex.valueOf(c.getImaginaryPart(), -c.getRealPart());
    }

    @Override
    public Complex divide(Complex c) {
        double tmp = c.getRealPart() * c.getRealPart() + c.getImaginaryPart() * c.getImaginaryPart();
        return Complex.valueOf(
                (-c.getImaginaryPart()) / tmp,
                (-c.getRealPart()) / tmp);
    }

    @Override
    public int hashCode() {
        return -31;
    }

    @Override
    public String toString() {
        return "(" + 0.0 + " + " + -1.0 + "i)";
    }
}