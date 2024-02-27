package zadanie_3;

import java.util.Map;

public class PrinterMap<K,J> {

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
    private Map<K,J> map;


    public PrinterMap(Map<K, J> map) {
        this.map = map;
    }


    public void print(){
        StringBuilder sb = new StringBuilder();
        for (K key : this.map.keySet()){
            sb.append("Klucz: ");
            sb.append(key);
            sb.append(", ");
            sb.append("Wartość: ");
            sb.append(this.map.get(key));
            sb.append(",");
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(sb.length()-1);
        sb.append(".");
        System.out.println(sb.toString());
    }

}
