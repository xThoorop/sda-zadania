package day_29_02_2024.zadanie_12i13.comparators;

import day_29_02_2024.zadanie_12i13.objects.Car;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {

        return o2.getEngineType().getRank()-o1.getEngineType().getRank();
    }
}
