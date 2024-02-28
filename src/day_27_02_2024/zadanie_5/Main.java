package day_27_02_2024.zadanie_5;

import java.util.HashSet;

public class Main {



    public static void main(String[] args){
        SDAHashSet<String> sdaHashSet = new SDAHashSet<String>();
        sdaHashSet.add("test");
        sdaHashSet.add("test");
        System.out.println(sdaHashSet.size());

    }
}
