package c2;

public class C2Nr {
    private int number1;
    private int number2;

    public C2Nr(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public int getSum() {
        return number1 + number2;
    }
}