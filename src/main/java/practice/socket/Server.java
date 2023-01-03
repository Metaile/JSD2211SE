package practice.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 */
public class Server {
    private ServerSocket serverSocket;
    public Server(){
        try {
            serverSocket=new ServerSocket(8088);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        try {
            Socket socket=serverSocket.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server=new Server();
        server.start();
    }
}
