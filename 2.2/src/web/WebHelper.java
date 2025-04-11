package web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebHelper {
    private static final String URL = "https://en.wikipedia.org/wiki/The_Day_After_Tomorrow";

    public String getWebSiteContent() {

        StringBuilder content = new StringBuilder();
        try {
            URL url = new URL(URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            reader.close();
            connection.disconnect();
        } catch (IOException e) {

            System.err.println("Error! Could not access the web content.");
        }
        return content.toString();
    }
}