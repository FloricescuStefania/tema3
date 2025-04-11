package produs;

/* Scrieți doua clase, Product (id, name, price in USD) si Produs (id, nume, pret in lei).
Proiectați o clasa helper care sa acționeze ca adaptor intre cele doua clase.
Ar trebui o metoda ProductToProdus si una ProdusToProduct. */
// ADAPTER PATTERN

public class Main {
    public static void main(String[] args) {

        Produs produsRO = new Produs(234, "Photo Camera", 2100.00);
        Product productUSA = new Product(523, "Printer", 689.78);

        Helper helper = new Helper();
        Product produsROtoUSA = helper.produsToProduct(produsRO);
        Produs productUSAtoRO = helper.productToProdus(productUSA);

        // before adapter
        System.out.println(produsRO);
        System.out.println(productUSA);
        // after adapter
        System.out.println(produsROtoUSA);
        System.out.println(productUSAtoRO);
    }
}