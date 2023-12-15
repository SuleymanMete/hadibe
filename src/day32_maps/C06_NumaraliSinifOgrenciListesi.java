package day32_maps;

import java.util.Map;

public class C06_NumaraliSinifOgrenciListesi {
    public static void main(String[] args) {


    // verieln sınıftaki öğrencilerin
    // numar, isim, soyisim ve şubelerini yazdıran
   // bir method oluşturun


    Map<Integer, String > ogrenciMap=MapMethosDepo.okulMapDonodur();
        System.out.println(ogrenciMap.get(103));
        MapMethosDepo.numaraliSinifOgrenciListesiYazdir(ogrenciMap,"11");
}}
