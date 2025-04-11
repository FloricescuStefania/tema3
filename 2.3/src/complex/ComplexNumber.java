package complex;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double modulus() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
