package c1;

/* Proiectați o clasă C1, care să permită citirea a două numere de la tastatură si calculul sumei lor, prin apelul unei metode publice
getSum(). Proiectați o clasă C2, care primește ca parametru un string JSON cu două chei, n1 și n2 și permite accesul la numerele
corespunzătoare cheilor n1 și n2. #Investigați dezvoltarea unui adaptor al clasei C2 la C1 care să permită calculul sumei
celor două chei. */

public class Main {
    public static void main(String[] args) {

        C1 c1 = new C1();
        c1.readNumbersFromKeyboard();
        System.out.println("Sum of numbers from C1: " + c1.getSum());

        C2 c2 = new C2("{\"n1\": 12, \"n2\": 21}");
        Adapter adapter = new Adapter(c2);
        int sum = adapter.getSum();
        System.out.println("Sum of numbers from C2: " + sum);
    }
}