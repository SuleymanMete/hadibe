package day30_iterator_collections;

import java.util.*;

public class C03_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>();
        List<Integer>ll2 = new LinkedList<>();
        Queue<String> ll3 = ll3 = new LinkedList<>();
        Deque<String> ll4 = new LinkedList<>();

        ll2.add(4);
        ll2.add(6);
        ll2.add(8);
        System.out.println(ll2);



        ll2.add(1,9);
        System.out.println(ll2);
        ll2.add(2,10);
        System.out.println(ll2);
        System.out.println(ll2.remove(1));
        System.out.println(ll2);



        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(6);
        list.add(9);
        list.add(10);

        System.out.println(list);

        System.out.println(list.retainAll(ll2));

        System.out.println("ll2 : "+ ll2);
        System.out.println("list : " + list);

    }
}
