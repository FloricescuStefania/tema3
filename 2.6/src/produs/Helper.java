package produs;

public class Helper {

    public Produs productToProdus(Product product){

        return new Produs(product.getId(), product.getName(), product.getPriceUSD() * 4.64);
    }

    public Product produsToProduct(Produs produs) {

        return new Product(produs.getId(), produs.getNume(), produs.getPretRON() / 4.64);
    }
}