import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class OddEvenClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 2000);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter No.");
            int n = Integer.parseInt(br.readLine());
            OutputStream o = s.getOutputStream();
            PrintStream ps = new PrintStream(o);
            ps.println(n);
            BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
            int c = br1.read();
            while (c != -1) {
                System.out.print((char) c);
                c = br1.read();
            }
        } catch (Exception e) {
        }
    }

}
