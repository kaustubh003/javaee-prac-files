import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        String message = null;
        DatagramSocket cs = new DatagramSocket();
        byte[] receiveData = new byte[512];
        byte[] sendData = new byte[512];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("UDP Client is created and now waiting for server...");
        InetAddress IPAddress = InetAddress.getLocalHost();
        int port = 9000;
        while (true) {
            System.out.println("Client Says:");
            message = br.readLine();
            sendData = message.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            cs.send(sendPacket);
            DatagramPacket receivPacket = new DatagramPacket(receiveData, receiveData.length);
            cs.receive(receivPacket);
            message = new String(receivPacket.getData(), 0, receivPacket.getLength());
            System.out.println("server says:" + message);
            cs.close();
        }

    }

}
