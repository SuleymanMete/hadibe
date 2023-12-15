package day28_Exceptions;

import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {

        // kullanıcıdan iki tam sayı alın
        // ilk sayıyı ikinciye bölüp yazdırın


        Scanner scanner = new Scanner(System.in);
        /*try {
            try {
                System.out.println("Lütfen iki sayı giriniz : ");
                int sayi1 = scanner.nextInt();
                int sayi2 = scanner.nextInt();
                System.out.println("Sayıların bölümü : " + sayi1 / sayi2);
            } catch (ArithmeticException e) {
                System.out.println("İkinci sayı 0 olamaz");
            }
        } catch (InputMismatchException f) {
            System.out.println("Tam sayı giriniz, ");
        }*/
       /* try {
            System.out.println("Lütfen iki sayı giriniz : ");
            int sayi1 = scanner.nextInt();
            int sayi2 = scanner.nextInt();
            System.out.println("Sayıların bölümü : " + sayi1 / sayi2);


        } catch (ArithmeticException e){
            System.out.println("İkinci sayı 0 olamaz.");
    }catch (InputMismatchException f )
        {
            System.out.println("Tam sayı giriniz.");}*/


        System.out.println("Lütfen iki sayı giriniz : ");

        try {
            int sayi1 = scanner.nextInt();
            int sayi2 = scanner.nextInt();
            System.out.println("Sayıların bölümü : " + sayi1 / sayi2);
        } catch (Exception e) {
            System.out.println("Yanlış giriş yaptınız.");
            System.out.println(e.toString());
        }

    }}
