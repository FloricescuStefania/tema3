package c1;

public class Adapter extends C1{
    private final C2 c2;

    public Adapter(C2 c2) {
        this.c2 = c2;
    }

    @Override
    public void readNumbersFromKeyboard() { }

    @Override
    public int getSum() {
        int number1 = c2.getNumber("n1");
        int number2 = c2.getNumber("n2");
        return number1 + number2;
    }
}