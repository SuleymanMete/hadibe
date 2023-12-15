package day31_collections;

import java.util.HashSet;
import java.util.Set;

public class C02_set {
    public static void main(String[] args) {

        Set<String> harfler = new HashSet<>();
        System.out.println(harfler.hashCode());

        harfler.add("B");
        harfler.add("Ali");
        System.out.println(harfler.hashCode());

    }
}
