package day29_excaptions_garbageCollector;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exceptions {
    public static void main(String[] args) {

        // kullanicidan toplanmak uzere sayilar isteyin
        // kullanici islemi bitirmek icin Q'ya basmalidir
        // kullanici Q'ya bastiginda,
        // kac sayi girildigini ve toplamin ne oldugunu yazdirin

        double girilenSayi = 0;
        double toplam = 0;
        int sayac = 0;
        Scanner scanner = new Scanner(System.in);
        boolean devameEdelimMi = true;
        while (devameEdelimMi) {

            System.out.println("Toplanmak üzere sayı giriniz bitirmek için Q'ya basınız ");
            try { // giriş sorunzusuz olduğunda çalışacak
                girilenSayi = scanner.nextDouble();
                toplam += girilenSayi;
                sayac++;
            } catch (InputMismatchException e) {// kullanıcı sayı dışında girerse
                String sayiOlmayanDeger = scanner.nextLine();
                if (sayiOlmayanDeger.equalsIgnoreCase("Q")) {
                    devameEdelimMi = false;

                } else {
                    System.out.println("Hatalı giriş yaptınız.Sayi girmelisiniz. ");


                }


            }


        }
        System.out.println("Girilen "+ sayac + " adet sayının toplamı : "+toplam);
    }
}
