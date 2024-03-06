package day_06_03_2024.zadanie_38.runnables;

import day_06_03_2024.zadanie_38.Main;

public class ViewRunnable implements Runnable{


    @Override
    public void run() {
        System.out.println(Main.getResults().getResult().get());
    }
}
