package singleton;

import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Config {
    private static Config instance;
    private String color;
    private int weight;

    private Config() {
    }

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public String getColor() {
        if (color == null) {
            loadConfig();
        }
        return color;
    }

    public int getWeight() {
        if (weight == 0) {
            loadConfig();
        }
        return weight;
    }

    private void loadConfig() {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Steff\\Desktop\\t3\\src\\singleton\\configuration.json\"))) {
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }
            JSONObject jsonObject = new JSONObject(jsonContent.toString());
            color = jsonObject.getString("color");
            weight = jsonObject.getInt("weight");
        } catch (IOException e) {
            System.err.println("Error! Could not load data from file");
            //e.printStackTrace();
        }
    }
}