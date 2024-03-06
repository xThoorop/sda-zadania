package day_06_03_2024.zadanie_36;

import day_06_03_2024.zadanie_36.runnables.ThreadPlaygroundRunnable;

public class Main {

    /*
Utwórz klasę, która ma dwa prywatne statyczne pola typu Thread (wątek) oraz standardową metodę public static void main(String[] args).
Następnie zainicjuj pola typu Thread używając konstruktora przyjmującego obiekt Runnable i przekaż ThreadPlaygroundRunnable tworząc go za pomocą konstruktora, za każdym razem podając inną nazwę.
Na każdym z wątków (Thread) użyj metody start().
     */


    public static void main(String[] args) {
        char[] namegen = "Asia miala kota ktory sie nazywal Maciej, byl czarny z bialymi latkami".toCharArray();
        for (int i = 1; i < 11; i++) {
            String name = String.valueOf(namegen[i])+String.valueOf(namegen[i+3])+String.valueOf(namegen[i+4]);
            Thread thread = new Thread(new ThreadPlaygroundRunnable(name));
            thread.start();
        }



    }


}
