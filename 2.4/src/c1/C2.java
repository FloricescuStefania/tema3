package c1;

import org.json.JSONObject;

public class C2 {
    private JSONObject json;

    public C2(String jsonString) {
        try {
            json = new JSONObject(jsonString);
        } catch (Exception e) {
            System.out.println("Error! Could not parse JSON. " + e.getMessage());
        }
    }

    public int getNumber(String key) {
        try {
            return json.getInt(key);
        } catch (Exception e) {
            System.out.println("Error! Could not access number. " + e.getMessage());
            return 0;
        }
    }
}