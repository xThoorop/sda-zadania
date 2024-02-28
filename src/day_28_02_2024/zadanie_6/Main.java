package day_28_02_2024.zadanie_6;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Main {



    public static void main(String[] args){
        NavigableMap<String,Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());
        treeMap.put("a",1);
        treeMap.put("b",2);
        treeMap.put("c",3);
        printFirstAndLast(treeMap);
    }

    public static <K,V> void printFirstAndLast(NavigableMap<K,V> treeMap){
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
    }
}
