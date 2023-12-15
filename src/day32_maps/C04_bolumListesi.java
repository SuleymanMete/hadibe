package day32_maps;

import java.util.Map;

public class C04_bolumListesi {
public static void main(String[] args){
    // Verilen bir öğrenci map'inde
    // istenen bölümdeki öğrencilerin şube, isim, soyisimlerini yazdıran bir
    // bir method oluşturun

    Map<Integer,String> ogrenciMap=MapMethosDepo.okulMapDonodur();
    System.out.println(ogrenciMap);
    //{101=Ali-Can-11-H-MF,
    // 102=Veli-Cem-10-k-TM,
    // 103=Ali-Cem-11-K-TM,
    // 104=Ayşe-Can-10-H-MF,
    // 105=Sevgi-Cem-11-M-TM,
    // 106=Sevgi-Can-10-K-MF,
    // 107=Esra-Han-10-M-SOZ,
    // 108=Azim-Kan-12-L-SOZ,
    // 109=Huseyin-Fan-12-H-MF,
    // 110=Azim-Kayısı-11-K-TM}

    MapMethosDepo.bolumListesiYazdir(ogrenciMap,"MF");
    MapMethosDepo.bolumListesiYazdir(ogrenciMap,"tm");



}
}
