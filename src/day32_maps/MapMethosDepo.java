package day32_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethosDepo {
    // verilen şubedeki öğrencilerin isim ve soyisimlerini yazdıran bir method oluşturun
    public static void subeListesiYazdir(Map<Integer, String> ogrenciMap,String istenenSube){
        Collection<String> valueCollection = ogrenciMap.values();
        String[] valueArr;
        System.out.println("====== " +istenenSube+" şubesi öğrenci listesi "+" =====");

        for (String each:valueCollection
             ) {
            valueArr= each.split("-");
            if (valueArr[3].equalsIgnoreCase(istenenSube)){
                System.out.println(valueArr[0]+" "+valueArr[1]);

            }

        }





    }


    public static Map<Integer, String> okulMapDonodur() {
        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-k-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayşe-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");
        ogrenciMap.put(107, "Esra-Han-10-M-SOZ");
        ogrenciMap.put(108, "Azim-Kan-12-L-SOZ");
        ogrenciMap.put(109, "Huseyin-Fan-12-H-MF");
        ogrenciMap.put(110, "Azim-Kayısı-11-K-TM");
        return  ogrenciMap;


    }

    public static void bolumListesiYazdir(Map<Integer, String> ogrenciMap, String istenenBolum ) {
        Collection<String>  valueCollection =  ogrenciMap.values();

        String[] valueArr;


        System.out.println("====="+ istenenBolum+" bölümü öğrenci listesi "+"=====");
        for (String each : valueCollection){
            valueArr = each.split("-");
            if (valueArr [4].equalsIgnoreCase(istenenBolum)){
                System.out.println(valueArr[2]+" "+valueArr[3] + " " + valueArr[0] +" "+ valueArr[1]);
            }

        }
    }

    public static void soyisimdenOgrenciBulma(Map<Integer, String> ogrenciMap, String istenenSoyisim) {
        Collection<String> valueCollection = ogrenciMap.values();
        String[] valueArr;
        System.out.println("====="+istenenSoyisim+" soyisimdeki öğrenci listesi =====");

        for (String each : valueCollection){
            valueArr = each.split("-");

            if(valueArr[1].equalsIgnoreCase(istenenSoyisim)){
                System.out.println(valueArr[2]+" "+ valueArr[3]+ " " + valueArr[0]+" "+valueArr[1]);
            }

        }

    }

    public static void numaraliSinifOgrenciListesiYazdir(Map<Integer, String> ogrenciMap, String sinifNo) {


        Set<Integer> keySeti =ogrenciMap.keySet();
        String valueEach;
        String[] valueArr;

        System.out.println("===== Numaralı " + sinifNo+ ". sınıf listesi=====");

        for (Integer each : keySeti
             ) {
            valueEach = ogrenciMap.get(each);
            valueArr = valueEach.split("-");
            if (valueArr[2].equalsIgnoreCase(sinifNo)){
                System.out.println(each+" "+valueArr[0]+" "+ valueArr[1]+ " "+ valueArr[3]);


            }


        }
        
        
         
    }
}
