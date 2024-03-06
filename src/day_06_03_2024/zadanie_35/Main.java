package day_06_03_2024.zadanie_35;

import day_06_03_2024.zadanie_35.runnables.MyRunnable;

public class Main {

    /*
 . Wewnątrz metody main utwórz zmienną typu klasy stworzonej powyżej np. MyRunnable oraz zainicjuj klasę.
Utwórz zmienną typu Thread i zainicjuj ją przekazując jako parametr konstruktora implementację interfejsu Runnable.
Na zmiennej typu Thread wykonać metodę start().
     */

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
