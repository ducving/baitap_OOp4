package baitap2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap con me may vao: ");
        String name=sc.nextLine();
        try {
            FileReader fr=new FileReader(name);
            int read=fr.read();
            while (read!=-1){
                System.out.print((char)read);
                read = fr.read();
            }
            fr.close();
        }catch (IOException e){
            System.out.println("oke");
        }
    }
}
