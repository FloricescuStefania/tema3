package rgb;

public class Main {
    public static void main(String[] args) {

        Config config = Config.getInstance();
        System.out.println("Color: " + config.getColor());
        System.out.println("Weight: " + config.getWeight());
    }
}