package Ekim10_2023;

import com.sun.tools.javac.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class JR {
    public static void main(String[] args) {


        Map map = new TreeMap<>();
        map.put("Baba "," Süleyman ");
        map.put("Anne ", " Özgül ");
        map.put("Abi ","Oguzhan");
        map.put("Kardeş ", "Engin");

        System.out.println(" Mete Ailesi fertleri  ");
        System.out.println("\t"+map);

        System.out.println("*********************************");

        Map map1 = new TreeMap<>();
        map1.put(100,"Süleyman");
        map1.put(102,"Özgül");
        map1.put(103,"Oğuzhan");
        map1.put(104,"Engin");

        System.out.println("Mete Ailesi Numaraları :"+"\n"+ "\t" +map1);
        System.out.println("Map : "+map1);
        System.out.println("HashMap()  : "+map1.hashCode());
        System.out.println("entrySet() : "+map1.entrySet());
        System.out.println("values()   : "+map1.values());
        System.out.println("keySet()   : "+map1.keySet());

    }
}
