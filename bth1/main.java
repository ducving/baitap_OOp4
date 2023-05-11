package bth1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        try{
            File file = new File("tep.txt");
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            fw.write("anaananananaananana");
            fw.flush();
            fw.close();
            FileReader fr = new FileReader(file);
            char [] vinh = new char[17];
            fr.read(vinh);
            for (char a: vinh) {
                System.out.println(a);
                fr.close();
            }
        }catch (IOException e){
            System.out.println("loi du lieu");
        }
    }


}