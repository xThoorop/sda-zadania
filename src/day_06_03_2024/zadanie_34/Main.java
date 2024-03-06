package day_06_03_2024.zadanie_34;

import day_06_03_2024.zadanie_34.runnables.MyThread;

public class Main {

    /*
    ZADANIE 34.
Utwórz klasę rozszerzającą klasę
Thread np. MyThread, przeciąż metodę run(),
 w której wyświetlisz w konsoli nazwę wątku odczytując ją ze statycznej metody aktualnego wątku:
Thread.currentThread().getName()
Utwórz klasę z metodą public static void main(String[] args).
 Wewnątrz metody main utwórz zmienną typu naszej klasy stworzonej powyżej np.
  MyThread oraz zainicjuj klasę. Na zmiennej wykonać metodę start().
     */

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
