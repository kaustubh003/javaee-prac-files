import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) throws IOException {
        Socket s1 = new Socket("localhost", 1254);
        InputStream in = s1.getInputStream();
        DataInputStream dis = new DataInputStream(in);
        String st = new String(dis.readUTF());
        System.out.println(st);
        dis.close();
        in.close();
        s1.close();
    }
}
