package day31_collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C05_ArraySorusuSetleCozum {
    public static void main(String[] args) {
          /* Verilen array'de tekrar eden elemenleri silip arrat'i
    her bir elementin unique olduğu hali ile kaydedin
     */
        int[] arr = {2, 4, 6, 4, 1, 2, 5, 7, 9, 4, 5, 7, 2, 6, 8, 2, 1};
        Set<Integer> tekrarsizSet = new TreeSet<>();
        // set unique elementlerden oluşturduğu için
        // array'deki elementleri set'e eklersek
        // tekrar edenleri yok olur

        for (Integer each : arr) {
            tekrarsizSet.add(each);

        }
        System.out.println("Set : " + tekrarsizSet);

        // Set index kullanmdığı iiçin for-loop kullanamayız
        // for-each loop kullanmayız

        int index = 0 ;
        for (Integer each : tekrarsizSet
             ) {
            arr[index]=each;
            index++;


        }
        System.out.println("Array'in son hali : "+ Arrays.toString(arr));
    }
}
