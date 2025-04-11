package complex;

public class Calculator {

    // ComplexNumber suma(ComplexNumber nr1, ComplexNumber n2) calculează suma celor doua numere complexe
    public static ComplexNumber sum(ComplexNumber nr1, ComplexNumber nr2) {
        double real = nr1.getReal() + nr2.getReal();
        double imaginary = nr1.getImaginary() + nr2.getImaginary();
        return new ComplexNumber(real, imaginary);
    }

    // ComplexNumber suma(Double nr1, Double n2) se folosește adapterul, se convertesc Double la ComplexNumber
    // și se face suma lor
    public static ComplexNumber sum(Double nr1, Double nr2) {
        ComplexNumber complex1 = Adapter.doubleToComplexNumber(nr1);
        ComplexNumber complex2 = Adapter.doubleToComplexNumber(nr2);
        return sum(complex1, complex2);
    }

    // ComplexNumber suma(ComplexNumber nr1, Double n2)
    public static ComplexNumber sum(ComplexNumber nr1, Double nr2) {
        ComplexNumber complex2 = Adapter.doubleToComplexNumber(nr2);
        return sum(nr1, complex2);
    }

    // ComplexNumber suma(Double nr1, ComplexNumber n2) adapterul convertește ComplexNumber la Double
    // și rezultatul sumei (un Double) va fi convertit (folosind adapterul) la un ComplexNumber.
    public static ComplexNumber sum(Double nr1, ComplexNumber nr2) {
        Double double2 = Adapter.complexNumberToDouble(nr2);
        Double result = double2 + nr1;
        return Adapter.doubleToComplexNumber(result);
    }
}