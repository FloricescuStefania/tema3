package produs;

public class Product {
    private int id;
    private String name;
    private double priceUSD;

    Product(int id, String name, double priceUSD) {
        this.id = id;
        this.name = name;
        this.priceUSD = priceUSD;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getPriceUSD(){
        return priceUSD;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceUSD(double priceUSD) {
        this.priceUSD = priceUSD;
    }

    @Override
    public String toString() {

        return this.id + ". " + this.name + " - " + String.format("%.2f", this.priceUSD) + " dollars.";
    }
}