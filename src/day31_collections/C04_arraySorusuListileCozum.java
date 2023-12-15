package day31_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_arraySorusuListileCozum {
    public static void main(String[] args) {
          /* Verilen array'de tekrar eden elemenleri silip arrat'i
    her bir elementin unique olduğu hali ile kaydedin
     */



        int [] arr = {2,4,6,4,1,2,5,7,9,4,5,7,2,6,8,2,1};
        List<Integer> tekrarsizList = new ArrayList<>();
        // array'deki elemenleri elden geçirelim
        // list'deki yoksa ekleyelim

        for (int i =0;i<arr.length; i++){

        if (!tekrarsizList.contains(arr[i])){
            tekrarsizList.add(arr[i]);
        }
    }
arr = new int [tekrarsizList.size()];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = tekrarsizList.get(i);


        }
        System.out.println("List arak tekrarsız elementler : " +tekrarsizList);
        System.out.println("Array'in son hali : " + Arrays.toString(arr));
}}
