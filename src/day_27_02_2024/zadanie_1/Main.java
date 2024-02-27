package day_27_02_2024.zadanie_1;


import java.util.*;

public class Main {


    /*
    Zadanie 1:
Stwórz metodę, która jako parametr przyjmuje listę stringów, następnie zwraca tą listę posortowaną alfabetycznie od Z do A.
Poszukaj odpowiednich metod do sortowania w klasach:
Collections (static method)
List (non-static method)
Poszukaj potrzebnych obiektów Comparator w klasach:
Comparator
Collections
String
     */


    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c","d","z","y");
        sortFromZToA(list);
        list.forEach(System.out::println);

    }


    public static List<String> sortFromZToA(List<String> list) {
        Collections.sort(list);
        Collections.reverse(list);
        return list;
    }


    }
