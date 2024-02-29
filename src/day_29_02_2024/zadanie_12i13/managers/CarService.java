package day_29_02_2024.zadanie_12i13.managers;

import day_29_02_2024.zadanie_12i13.comparators.CarComparator;
import day_29_02_2024.zadanie_12i13.enums.EngineType;
import day_29_02_2024.zadanie_12i13.exceptions.CarListEmptyException;
import day_29_02_2024.zadanie_12i13.objects.Car;
import day_29_02_2024.zadanie_12i13.objects.Manufacturer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    private static List<Car> cars = new ArrayList<>();


    public static boolean addCar(Car car){
        if(cars.contains(car)){
            return false;
        }
        cars.add(car);
        return true;
    }
    public static boolean removeCar(Car car){
        if(cars.contains(car)){
            cars.remove(car);
            return true;
        }
        return false;
    }

    public static List<Car> getCars() {
        return cars;
    }

    public static List<Car> getCarsWithV12() {
        return cars.stream().filter(c -> c.getEngineType().equals(EngineType.V12)).collect(Collectors.toUnmodifiableList());
    }
    public static List<Car> getCarsBefore1999() {
        return cars.stream().filter(c -> c.getDateOfProduction().getYear() <2000).collect(Collectors.toUnmodifiableList());
    }
    public static Car getCheapestCar() throws CarListEmptyException {
        if(cars.isEmpty()) throw new CarListEmptyException();
        Car cheapestCar = cars.get(0);
        for (Car car : cars){
            if(car.getPrice() <cheapestCar.getPrice()){
                cheapestCar = car;
            }
        }
        return cheapestCar;
    }
    public static Car getDearestCar() throws CarListEmptyException {
        if(cars.isEmpty()) throw new CarListEmptyException();
        Car cheapestCar = cars.get(0);
        for (Car car : cars){
            if(car.getPrice() >cheapestCar.getPrice()){
                cheapestCar = car;
            }
        }
        return cheapestCar;
    }

    public static Car getCarWith3Manufacturer(){
        return cars.stream().filter(c -> c.getManufacturers().size()>=3).findFirst().get();
    }

//zwracanie listy wszystkich aut posortowanych zgodnie z przekazanym parametrem: rosnąco/malejąco,
    public static List<Car> getCarWithSortedEngines(){
        List<Car> cars = new ArrayList<>(getCars());
        cars.sort(new CarComparator());
        return cars;
    }


    public static boolean isThereACar(Car car){
        return cars.contains(car);
    }
    public static List<Car> getCarsFromManufacturer(Manufacturer manu){
        return cars.stream().filter(c -> c.getManufacturers().contains(manu)).collect(Collectors.toList());
    }


    /*
    ZADANIE 13.

zwracanie listy aut wyprodukowanych przez producenta z rokiem założenia <,>,<=,>=,=,!= od podanego. brak czasu
     */
}
