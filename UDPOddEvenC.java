import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPOddEvenC {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(8000);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number:");
            String num = br.readLine();
            byte[] b = new byte[1024];
            b = num.getBytes();
            DatagramPacket dp = new DatagramPacket(b, b.length, InetAddress.getLocalHost(), 9000);
            ds.send(dp);
            byte b1[] = new byte[1024];
            DatagramPacket dp1 = new DatagramPacket(b1, b1.length);
            ds.receive(dp1);
            String str = new String(dp1.getData(), 0, dp1.getLength());
            System.out.println(str);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
