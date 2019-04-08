import math.Complex;

/**
 * @author bjorn
 * @since 2019-03-18
 */
public class MainApp {
    public static void main(String[] args) {
        Complex zero = Complex.valueOf(1, 1).plus(Complex.ONE).subtract(Complex.I).multiply(Complex.ZERO).divide(Complex.valueOf(1, 1));
        System.out.println(zero);
        System.out.println(zero.getRealPart());
        System.out.println(zero.getImaginaryPart());
        System.out.println(-0.0);
//        System.out.println(Complex.I.divide(Complex.ZERO));
        System.out.println(Complex.valueOf(0.0, -0.0).getClass());
    }
}
