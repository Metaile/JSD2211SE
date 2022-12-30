package practice.socket;

import java.io.IOException;
import java.net.Socket;

/**
 * 客户端
 */
public class Client {
    private Socket socket;

    public Client() {
        try {
            System.out.println("启动");
            socket = new Socket("localhost", 8088);
            System.out.println("完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
