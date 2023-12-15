package day32_maps;

public class C01_StringManipulations {
    public static void main(String[] args) {
        // bir öğrencinin bilgileri arada - olarak String bir variable'a atanmıştır.
        // isim -soyisim- sınıf- şube - bölüm
        // bu formatta verilen bilgiden, şubeyi yazdıran bir method oluşturun


        String bilgi = "Ali Cabbar-Korkut-10-E-MF-Söz";
        subeYazdir(bilgi);
        isimSoyisimYazdir(bilgi);
        sinifSubeBul(bilgi);
    }

    public static void subeYazdir(String bilgi) {
        String[] bilgilerArr = bilgi.split("-");
        System.out.println("Öğrenci şube : " + bilgilerArr[3]);


    }

    public static void isimSoyisimYazdir(String bilgi) {
        String[] bilgiArr = bilgi.split("-");
        System.out.println("İsim soyisim : " + bilgiArr[0] + " " + bilgiArr[1]);

    }

    public static void sinifSubeBul(String bilgi) {

        String[] bilgiArr = bilgi.split("-");
        System.out.println("Sınıf : " + bilgiArr[3] + " " + "Şube : " + bilgiArr[4]);


    }


}
