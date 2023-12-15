package day31_collections;

import java.util.Arrays;

public class C03_ArraydenTekrarEdenSayilariSilme {
    public static void main(String[] args) {
        /* Verilen array'de tekrar eden elemenleri silip arrat'i
    her bir elementin unique olduğu hali ile kaydedin
     */

        int[] arr = {2,4,6,4,1,2,5,9,4,5,7,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        /* ===>> 1. önce bir forloop ile kaç tane silinicek bulup sonra
         bor array oluşturup uygun olan elemenleri ona tanımayınız
         ===>> 2. yöntem
         */

        // 1.yöntem

        int silinecekElemanSayisi = 0;
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i]==arr[i+1]) {
                silinecekElemanSayisi++;

            }

        }
       // int[] yeniArr = new int[]
    }

    }






