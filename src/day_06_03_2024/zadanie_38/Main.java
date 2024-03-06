package day_06_03_2024.zadanie_38;

import day_06_03_2024.zadanie_38.objects.Results;
import day_06_03_2024.zadanie_38.runnables.CheckGoalRunnable;
import day_06_03_2024.zadanie_38.runnables.ViewRunnable;

import java.time.Duration;
import java.time.Period;
import java.time.temporal.TemporalUnit;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {


    /*
    Napisz program, który ma za zadanie rozwiązać poniższy problem.
Istnieje system przechowujący aktualne wyniki w zawodach. Wiele ekranów odczytuje aktualne wyniki, natomiast kilka czujników aktualizuje te wyniki.
Napisz program, który pozwala na nieprzerwany odczyt danych przez wiele ekranów (wątków) oraz aktualizację danych przez wiele czujników (wątków) - ustaw to jako operacje cykliczne.
Wykorzystaj obiekty 'Atomic' aby zapewnić atomowość operacji.
     */

    private static Results results;
    private static Set<ScheduledExecutorService> threads = new HashSet<>();
    public static void main(String[] args) throws InterruptedException {
        results = new Results();
        ScheduledExecutorService thread = Executors.newSingleThreadScheduledExecutor();
        thread.scheduleAtFixedRate(new ViewRunnable(), 0, 100, TimeUnit.MILLISECONDS);
        threads.add(thread);
        thread = Executors.newSingleThreadScheduledExecutor();
        thread.scheduleAtFixedRate(new CheckGoalRunnable(), 0, 1, TimeUnit.SECONDS);
        threads.add(thread);

        thread = Executors.newSingleThreadScheduledExecutor();
        thread.scheduleAtFixedRate(new CheckGoalRunnable(), 0, 1, TimeUnit.SECONDS);
        threads.add(thread);

        thread = Executors.newSingleThreadScheduledExecutor();
        thread.scheduleAtFixedRate(new CheckGoalRunnable(), 0, 1, TimeUnit.SECONDS);
        threads.add(thread);
        Thread.sleep(20000);
        if(results.getResult().get()>=50){
            for (ScheduledExecutorService t : threads){
                t.shutdownNow();
            }
        }
    }

    public static Results getResults() {
        return results;
    }
}
