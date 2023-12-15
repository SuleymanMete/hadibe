package day29_excaptions_garbageCollector;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C03_ParentChildExceptions {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/day28_Exceptions1/text.txt");



        } catch (FileNotFoundException e) {
            System.out.println("Dosya yolu yanlış");
        }


    }






}
