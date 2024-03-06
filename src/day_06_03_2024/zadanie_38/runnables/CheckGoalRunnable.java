package day_06_03_2024.zadanie_38.runnables;

import day_06_03_2024.zadanie_38.Main;

public class CheckGoalRunnable implements Runnable{


    @Override
    public void run() {
        if(true){//jezeli jest gol
            Main.getResults().addResult(1);
        }
    }
}
