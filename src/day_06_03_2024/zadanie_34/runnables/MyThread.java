package day_06_03_2024.zadanie_34.runnables;

import day_06_03_2024.zadanie_34.Main;

public class MyThread extends Thread{


    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
