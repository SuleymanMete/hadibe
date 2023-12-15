package day30_iterator_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_Queue {
    public static void main(String[] args) {

        Queue<String> harfler = new LinkedList<>();
        harfler.add("y");
        harfler.add("K");
        harfler.add("M");
        harfler.add("s");
        System.out.println(harfler);
        System.out.println(harfler.remove());


    }}