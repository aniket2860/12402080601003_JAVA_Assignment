import java.io.*;
import java.net.*;

public class EchoServer {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(6000);
            System.out.println("Server started... Waiting for client");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            String message = input.readLine();
            System.out.println("Client says: " + message);

            output.println("Echo: " + message);

            socket.close();
            serverSocket.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}