import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

public class readFromURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com");
            URLConnection con = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            System.out.println(br.readLine());
        } catch (Exception e) {

        }

    }
}
