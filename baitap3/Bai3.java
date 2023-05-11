package baitap3;

import java.io.FileWriter;
import java.io.IOException;

public class Bai3 {
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("tep.txt");
            fw.write("auigdjafihjafiuafuaifgiasfakjsbfkjahfuihuifasjkbjkabcajkfgafhalifhakfvak");
            fw.close();
        } catch (IOException e) {
            System.out.println("sdas");
        }

    }
}
