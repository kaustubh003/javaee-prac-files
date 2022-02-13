import java.net.*;
import java.io.*;

public class WindowDemo {
    public static void main(String[] args) {
        try {
            Socket theSocket = new Socket("www.google.com", 80);
            System.out.println("Connected to " + theSocket.getInetAddress() + " on port " + theSocket.getPort()
                    + " from port " + theSocket.getLocalPort() + " of " + theSocket.getLocalAddress());
            theSocket.close();
        } catch (UnknownHostException e) {
            System.err.println("I can't find https://google.com");
        } catch (SocketException e) {
            System.err.println("Unable to connect to https://google.com");
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}