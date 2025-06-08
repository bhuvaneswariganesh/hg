import java.io.*;
import java.net.*;

public class HttpWeb {
    public static void main(String[] args) {
        try {
            // Use a clean and static HTML page for testing
            URL url = new URL("https://httpbin.org/html");

            // Open connection and set user agent (some sites block bots)
            URLConnection connection = url.openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");

            // Read from the web page
            BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));

            // Write to output.html
            BufferedWriter out = new BufferedWriter(new FileWriter("output.html"));

            String line;
            while ((line = in.readLine()) != null) {
                out.write(line);
                out.newLine();
            }

            in.close();
            out.close();

            System.out.println("Downloaded successfully. Open output.html in your browser.");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
