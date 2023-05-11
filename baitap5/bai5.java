package baitap5;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class bai5 {
    Scanner sc=new Scanner(System.in);
    public String readFileText(String path){
        try {
            FileReader fr=new FileReader(path);
            int read=fr.read();
            while (read!=-1){
                System.out.println((char)read);
                read = fr.read();
            }
            fr.close();
        }catch (IOException e){
            System.out.println("loi");
        }
        return path;
    }
    public boolean writerFileText(String path , String data){
        try {
            FileWriter fw=new FileWriter(path);
            try{
                if (data == ""){
                    throw new NullPointerException("loi");
                }
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
                return false;
            }
            fw.write(data);
            fw.close();
            return true;
        }catch (IOException e){
            System.out.println("loi");
        }return false;
    }
}
