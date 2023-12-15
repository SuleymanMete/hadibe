package day28_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        daha çok dosya okuma veya dosyay bilgi kaydetme ileilgilidir.
        Javada bu işlemlere input/output dendiğinde
         */

        String dosyayolu = "src/day28_Exceptions/text.txt";
       FileInputStream fis = new FileInputStream(dosyayolu);
    }
}
