package day_27_02_2024.zadanie_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    //Stwórz metodę, która jako parametr przyjmuje listę
    // stringów, następnie zwraca tą listę posortowaną alfabetycznie od Z do A
    // nie biorąc pod uwagę wielkości liter.
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","B","C","d","Z");
        sortFromZToAIgnoreCases(list);
        list.forEach(System.out::println);
    }


    public static List<String> sortFromZToAIgnoreCases(List<String> list) {
        Collections.sort(list,String.CASE_INSENSITIVE_ORDER);
        Collections.reverse(list);
        return list;
    }
}
