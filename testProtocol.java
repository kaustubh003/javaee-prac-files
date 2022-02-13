import java.net.MalformedURLException;
import java.net.URL;

public class testProtocol {
    public static void main(String[] args) {
        try {
            System.out.println((new URL("https://www.yahoo.com").getProtocol()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
