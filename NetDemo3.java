import java.net.*;
public class NetDemo3 {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost();
            String address = local.getHostAddress();
            String hostName = local.getHostName();
            System.out.println("Local Host IP Address:"+address);
            System.out.println("Local Host Name:"+hostName);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
