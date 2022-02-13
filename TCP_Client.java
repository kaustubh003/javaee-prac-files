import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class TCP_Client {
    public static void main(String[] args) throws IOException {
        Socket cs = null;
        String message = null;
        DataInputStream istream;
        DataOutputStream ostream;
        cs = new Socket(InetAddress.getLocalHost(), 8002);
        System.out.println("Client Socket is created and waiting for server");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Client Message:");
        message = br.readLine();
        ostream = new DataOutputStream(cs.getOutputStream());
        istream = new DataInputStream(cs.getInputStream());
        ostream.writeUTF(message);
        ostream.flush();
        message = istream.readUTF();
        System.out.println("Client Says:" + message);
        cs.close();
        ostream.close();
        istream.close();
    }

}
