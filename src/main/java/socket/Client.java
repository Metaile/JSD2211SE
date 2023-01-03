package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 客服端
 */
public class Client {
    private Socket socket;

    public Client() {
        try {
            System.out.println("正在与服务器建立连接...");
            socket = new Socket("localhost", 8088);
            System.out.println("连接成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        String line;
        try {
            System.out.print("请讲:");
            while (!"exit".equals(line = scan.nextLine())) {
                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osw);
                PrintWriter pw = new PrintWriter(bw, true);
                pw.println(line);
                System.out.print("请讲:");
//                pw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
