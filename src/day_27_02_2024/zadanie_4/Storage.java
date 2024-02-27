package day_27_02_2024.zadanie_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage<K,V> {


    private Map<K,Values> map;

    public Storage() {
        this.map = new HashMap<>();
    }

    public void addToStorage(K key, V value){
        //		this.map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
        if(this.map.containsKey(key)){
            this.map.put(key, this.map.get(key).addValues(value));

        }else {
            this.map.put(key, new Values<V>().addValues(value));
        }
    }

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
