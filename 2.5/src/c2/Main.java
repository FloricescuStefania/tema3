package c2;

/* Proiectați o clasă C2Nr care să permită calculul sumei a două numere și o clasă C3Nr care să permită calculul sumei a trei numere.
Exemplu de utilizare: C2Nr c2Nr = new C2Nr(1,2); c2Nr.getSum() returnează 3
C3Nr c3Nr = new C3Nr(1,2,3); c3Nr.getSum() returnează 6
Scrieți o metodă într-o clasă de tip Adapter care sa convertească o instanță a C2Nr la una de C3Nr. */
// ADAPTER PATTERN

public class Main {
    public static void main(String[] args) {

        C2Nr c2nr = new C2Nr(1, 2);
        System.out.println("Sum of two numbers: " + c2nr.getSum());

        C3Nr c3nr = new C3Nr(1, 2, 3);
        System.out.println("Sum of three numbers: " + c3nr.getSum());

        C3Nr c2nrtoc3nr = Adapter.adapt(c2nr);
        System.out.println("Sum of two numbers using C3Nr: " + c2nrtoc3nr.getSum());
    }
}