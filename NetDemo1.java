import java.net.*;
public class NetDemo1 {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println("Host Name:"+ip.getHostName());
            System.out.println("IP Address:"+ip.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
