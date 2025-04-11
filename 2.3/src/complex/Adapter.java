package complex;

public class Adapter {

    public static ComplexNumber doubleToComplexNumber(Double real) {
        return new ComplexNumber(real, 0);
    }

    public static Double complexNumberToDouble(ComplexNumber complexNumber) {
        return complexNumber.modulus();
    }
}
