package zadanie_3;

import java.util.HashMap;
import java.util.Map;

public class Main<K,T> {

    /*
    ZADANIE 3.
Stwórz metodę, która jako parametr przyjmuje mapę, gdzie kluczem jest string, a wartością liczba, a następnie wypisuje każdy element mapy do konsoli w formacie: Klucz: "", Wartość: "". Na końcu każdego wiersza poza ostatnim, powinien być przecinek, a w ostatnim kropka.
Przykład:
Klucz: Java, Wartość: 18,
Klucz: Python, Wartość: 1,
…
Klucz: PHP, Wartość: 0.
Bonus:
Napisz aby metoda działała niezależnie od typów w Mapie.
     */


    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"jeden");
        map.put(2,"dwa");
        map.put(3,"trzy");
        map.put(4,"cztery");
        map.put(5,"piec");
        map.put(6,"szesc");
        PrinterMap printerMap = new PrinterMap(map);
        printerMap.print();
    }

}
