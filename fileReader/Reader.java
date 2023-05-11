package fileReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        try {
            File file=new File("trongancut.txt");
            FileReader fr=new FileReader(file);
            FileWriter fw = new FileWriter(file);
            fw.write("Vinhthichancutlam");
            fw.flush();
            fw.close();
            char [] aaa=new char[10];

        }catch (IOException e){
            System.out.println("loi du lieu");
        }

    }
}
