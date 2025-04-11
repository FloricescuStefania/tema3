package c2;
// c2 to c3
public class Adapter {
    public static C3Nr adapt(C2Nr c2nr) {
        return new C3Nr(c2nr.getNumber1(), c2nr.getNumber2(), 0);
    }
}