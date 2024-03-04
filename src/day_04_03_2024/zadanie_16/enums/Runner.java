package day_04_03_2024.zadanie_16.enums;

import java.util.Arrays;

public enum Runner {

    /*
    ZADANIE 16.
Stwórz klasę enum Runner ze stałymi BEGINNER, INTERMEDIATE, ADVANCED. Enum powinien posiadać dwa parametry:
• minimalny czas przebiegnięcia maratonu w minutach
• maksymalny czas przebiegnięcia maratonu w minutach
Dodatkowo enum Runner powinien zawierać metodę statyczną getFitnessLevel(),
która przyjmuje na wejściu dowolny czas przebiegnięcia maratonu, a jako rezultat powinna zwracać konkretny obiekt Runner na podstawie przekazanego czasu.
     */


    BEGINNER(140,400),
    INTERMEDIATE(100,139),
    ADVANCED(60,99);

    private int minTime;
    private int maxTime;


    Runner(int minTime, int maxTime){
        this.minTime = minTime;
        this.maxTime = maxTime;
    }


    //ja 150
    //beginner 140-400
    public static Runner getFitnessLevel(int minutes){
        return Arrays.stream(Runner.values()).filter(r -> minutes >= r.getMinTime() && minutes <=r.getMaxTime()).findAny().get();
    }

    public int getMinTime() {
        return minTime;
    }

    public int getMaxTime() {
        return maxTime;
    }
}
