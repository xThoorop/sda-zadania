package day_29_02_2024.zadanie_12i13;

import day_29_02_2024.zadanie_12i13.enums.EngineType;
import day_29_02_2024.zadanie_12i13.managers.CarService;
import day_29_02_2024.zadanie_12i13.objects.Car;
import day_29_02_2024.zadanie_12i13.objects.Manufacturer;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {


    public static void main(String[] args){
        Manufacturer vw = new Manufacturer("Volkswagen", LocalDate.of(1937,3,28),"Niemcy");
        Manufacturer audi = new Manufacturer("Audi", LocalDate.of(1909,7,16),"Niemcy");
        Car audis = new Car("Audi","A4",40000,LocalDate.now(), Arrays.asList(vw,audi), EngineType.V8);
        Car golf = new Car("GOLF","5",4000,LocalDate.now(), Arrays.asList(vw), EngineType.V6);
        System.out.println(CarService.getCarWithSortedEngines());
    }
}
