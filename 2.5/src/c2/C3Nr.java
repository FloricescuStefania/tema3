package c2;

public class C3Nr {
    private int number1;
    private int number2;
    private int number3;

    public C3Nr(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public int getSum() {
        return number1 + number2 + number3;
    }
}