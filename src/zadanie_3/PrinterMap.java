package zadanie_3;

import java.util.Map;

public class PrinterMap<K,J> {

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
