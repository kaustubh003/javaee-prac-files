import java.net.*;
import java.io.*;

public class WindowDemo2 {
    public static void main(String[] args) {
        for (int port = 1; port <= 65535; port++) {
            try {
                ServerSocket server = new ServerSocket(port);
            } catch (IOException e) {
                System.out.println("There is a server on the port " + port);
            }
        }
    }
}
