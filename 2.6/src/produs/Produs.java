package produs;

public class Produs {
    private int id;
    private String nume;
    private double pretRON;

    Produs(int id, String nume, double pretRON) {
        this.id = id;
        this.nume = nume;
        this.pretRON = pretRON;
    }

    public int getId(){
        return id;
    }

    public String getNume(){
        return nume;
    }

    public double getPretRON(){
        return pretRON;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPretRON(double pretRON) {
        this.pretRON = pretRON;
    }

    @Override
    public String toString() {

        return this.id + ". " + this.nume + " - " + String.format("%.2f", this.pretRON) + " ron.";
    }
}