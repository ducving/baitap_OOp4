package baitap5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao : ");
        String path=sc.nextLine();
        System.out.println("nhap du lieu vao ");
        String data = sc.nextLine();
//        bai5 b=new bai5();
//        b.readFileText(path);
        bai5 writer = new bai5();
        System.out.println(writer.writerFileText(path,data));
    }
}
