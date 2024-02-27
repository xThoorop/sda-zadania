package zadanie_3;

import java.util.HashMap;
import java.util.Map;

public class Main<K,T> {


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
