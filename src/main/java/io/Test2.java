package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        File file=new File("./note.txt");
        FileOutputStream fos=new FileOutputStream(file,true);
        System.out.print("--------:");
        String s=scan.nextLine();
        while (!"exit".equals(s)){
            fos.write(s.getBytes(StandardCharsets.UTF_8));
            s=scan.nextLine();
        }
        fos.close();
    }
}
