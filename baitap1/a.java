package baitap1;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;
public class a {
    public static void main(String[] args) {
        File file=new File("abc.txt");
        try {
            file.createNewFile();
            FileReader fr = new FileReader(file);
            int read=fr.read();
            while (read!=-1){
                System.out.print((char)read);
                read = fr.read();
            }
            fr.close();
        }catch (IOException e){
            System.out.println("co loi");
        }
    }
}
