package complex;

/* Considerați o clasa ComplexNumber. Scrieți și utilizați un adapter de la un Double la ComplexNumber
și de la ComplexNumber la Double (prin calculul modulului ComplexNumber). Folosiți adapterul pentru
a implementa următoarele metode:
•ComplexNumber suma(ComplexNumber nr1, ComplexNumber n2) calculează suma celor doua numere complexe
(în varianta clasică, învățată la matematică)
•ComplexNumber suma(Double nr1, Double n2) se folosește adapterul, se convertesc Double la ComplexNumber
și se face suma lor
•ComplexNumber suma(ComplexNumber nr1, Double n2) și ComplexNumber suma(Double nr1, ComplexNumber n2)
adapterul convertește ComplexNumber a Double și rezultatul sumei (un Double) va fi convertiti
(folosind adapterul) la un ComplexNumber. */

import static complex.Calculator.sum;

public class Main {
    public static void main(String[] args) {

        ComplexNumber complex1 = new ComplexNumber(3, 4);
        ComplexNumber complex2 = new ComplexNumber(4, 3);
        Double double1 = 2.1;
        Double double2 = 1.2;

        ComplexNumber sum1 = sum(complex1, complex2); // 7 + 7 * i
        System.out.println(sum1);
        ComplexNumber sum2 = sum(double1, double2); // 3.3 + 0 * i
        System.out.println(sum2);
        ComplexNumber sum3 = sum(complex1, double2); // 4.2 + 4 * i
        System.out.println(sum3);
        ComplexNumber sum4 = sum(double1, complex2); // 7.1 + 0 * i
        System.out.println(sum4);
    }
}
