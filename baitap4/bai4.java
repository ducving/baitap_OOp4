package baitap4;

import java.io.File;
import java.io.IOException;

public class bai4 {
    public static void main(String[] args) {
        try {
            File file=new File("abcd.txt");
            file.createNewFile();
           if(file.isDirectory()){
               System.out.println("do la thu muc");
           }else {
               System.out.println("ko phai thu muc");
           }
            System.out.println(file.exists());
            System.out.println(file.getPath());
        }catch (IOException e){
            System.out.println("dasdsad");
        }
    }
}
