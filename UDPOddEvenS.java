import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPOddEvenS {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(9000);
            System.out.println("Searching...");
            byte b[] = new byte[1024];
            DatagramPacket dp = new DatagramPacket(b, b.length);
            ds.receive(dp);
            String str = new String(dp.getData(), 0, dp.getLength());
            System.out.println(str);
            int a = Integer.parseInt(str);
            String s = new String();
            System.out.println("Checking...");
            if (a % 2 == 0) {
                s = "Number is Even";
            } else {
                s = "Number is Odd";
            }
            byte b1[] = new byte[1024];
            b1 = s.getBytes();
            DatagramPacket dp1 = new DatagramPacket(b1, b1.length, InetAddress.getLocalHost(), 8000);
            ds.send(dp1);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}