package zadanie_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
ZADANIE 4.
Stwórz klasę Storage, która będzie miała prywatne pole typu Map, publiczny konstruktor oraz metody:
addToStorage(String key, String value) → dodawanie elementów do przechowywalni
printValues(String key) → wyświetlanie wszystkich elementów pod danym kluczem
findValues(String value) → wyświetlanie wszystkich kluczy, które mają podaną wartość
Klasa Storage powinna pozwalać na przechowywanie wielu wartości pod jednym kluczem.
Bonus:
Napisz rozwiązanie aby przyjmowało dowolny typ generyczny zamiast String key i value;
 */
public class Storage<K,V> {


    private Map<K,Values> map;

    public Storage() {
        this.map = new HashMap<>();
    }

    public void addToStorage(K key, V value){
        if(this.map.containsKey(key)){
            this.map.put(key, this.map.get(key).addValues(value));

        }else {
            this.map.put(key, new Values<V>().addValues(value));
        }
    }
//findValues(String value) → wyświetlanie wszystkich kluczy, które mają podaną wartość

    public void findValues(V values) {
        for (Map.Entry<K, Values> entry : this.map.entrySet()) {
            if (entry.getValue().getValues().contains(values)) {
                System.out.println(entry.getKey());
            }
        }
    }
    public void printValues(K key){
        for (Map.Entry<K,Values> entry : this.map.entrySet()){
            if(key.equals(entry.getKey())){
                System.out.println(entry.getValue().getValues());
            }
        }
    }
    public class Values<V> {

        private List<V> values;

        public Values() {
            this.values = new ArrayList<>();
        }

        public List<V> getValues() {
            return values;
        }

        public void setValues(List<V> values) {
            this.values = values;
        }

        public Values removeValues(V value) {
            this.values.remove(value);
            return this;
        }

        public Values addValues(V value) {
            this.values.add(value);
            return this;
        }
    }
    }
