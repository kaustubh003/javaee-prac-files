import java.net.*;

public class URLDemo {
    public static void main(String[] args) {
        try {
            URL hp = new URL("https://www.yahoo.com:80/index");
            System.out.println(hp.getProtocol());
            System.out.println(hp.getPath());
            System.out.println(hp.getHost());

            System.out.println(hp.getFile());
            System.out.println(hp.getPort());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}