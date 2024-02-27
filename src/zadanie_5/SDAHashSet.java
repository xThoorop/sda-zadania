package zadanie_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class SDAHashSet<V> implements SetInterface<V>{


    private ArrayList<V> list;

    public SDAHashSet() {
        this.list = new ArrayList<>();
    }

    public void add(V value) {
        if(this.list.contains(value)) return;
        this.list.add(value);
    }

    public void remove(V value) {
        this.list.remove(value);
    }


    public int size() {
        return this.list.size();
    }

    public boolean contains(V value) {
        return this.list.contains(value);
    }

    public void clear() {
        this.list.clear();
    }

}
