import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(1254);
        System.out.println("Server Started, Waiting for client connection...");
        Socket s1 = s.accept();
        OutputStream out = s1.getOutputStream();
        DataOutputStream dos = new DataOutputStream(out);
        dos.writeUTF("hi there!");
        dos.close();
        out.close();
        s1.close();
    }
}
