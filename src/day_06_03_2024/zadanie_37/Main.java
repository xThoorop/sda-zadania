package day_06_03_2024.zadanie_37;

import day_06_03_2024.zadanie_37.runnables.ThreadPlaygroundRunnable;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {


    /*
    Stwórz klasę zawierającą standardową metodę statyczną main oraz zmienną typu Executor i
     korzystając z metody fabrykującej newFixedThreadPool klasy Executors utwórz pulę executorów o rozmiarze 2.
W iteracji dodaj do Executora 10 obiektów klasy ThreadPlaygroundRunnable z poprzedniego zadania. Jako nazwy użyj dowolnego ciągu znaków oraz numeru aktualnej iteracji.

     */
    public static void main(String[] args) throws InterruptedException {
        char[] namegen = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        long start = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            String name = String.valueOf(namegen[i])+String.valueOf(namegen[i+3])+String.valueOf(namegen[i+4]);
            name+= i;
            executor.execute(new ThreadPlaygroundRunnable(name));
        }
        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println(System.nanoTime()-start + "nano ");
    }
}
