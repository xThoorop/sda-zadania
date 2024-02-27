package day_27_02_2024.zadanie_5;

public interface SetInterface<V> {
    /*
                • add
• remove
• size
• contains
• clear
     */

    void add(V value);
    void remove(V value);

    int size();

    boolean contains(V value);

    void clear();

}
