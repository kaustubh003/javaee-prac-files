import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class OddEvenServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(2000);
            System.out.println("Searching...");
            Socket s = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            int n = Integer.parseInt(br.readLine());
            OutputStream o = s.getOutputStream();
            PrintStream ps = new PrintStream(o);
            System.out.println("Checking");
            if (n % 2 == 0) {
                ps.println("No is Even");
            } else {
                ps.println("No is Odd");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
