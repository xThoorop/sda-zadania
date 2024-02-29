package day_29_02_2024.zadanie_12i13.objects;

import day_29_02_2024.zadanie_12i13.enums.EngineType;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Car {
    /*
    Stwórz klasę Car, która będzie zawierać pola: nazwa, model, cena, rok produkcji, lista producentów (Manufacturer),
oraz typ silnika (reprezentowany jako klasa enum, np. V12, V8, V6, S6, S4, S3).
Uwzględnij wszystkie niezbędne metody oraz parametry konstruktora. Zaimplementuj metody hashcode() i equals(
     */

    private String name;
    private String model;
    private int price;
    private LocalDate dateOfProduction;
    private List<Manufacturer> manufacturers;

    private EngineType engineType;

    public Car(String name, String model, int price, LocalDate dateOfProduction, List<Manufacturer> manufacturers, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = cena;
        this.dateOfProduction = dateOfProduction;
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(name, car.name)
                && Objects.equals(model, car.model)
                && Objects.equals(dateOfProduction, car.dateOfProduction)
                && Objects.equals(manufacturers, car.manufacturers) && engineType == car.engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nazwa='" + name + '\'' +
                ", model='" + model + '\'' +
                ", cena=" + price +
                ", dateOfProduction=" + dateOfProduction +
                ", manufacturers=" + manufacturers +
                ", engineType=" + engineType +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, dateOfProduction, manufacturers, engineType);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getDateOfProduction() {
        return dateOfProduction;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public EngineType getEngineType() {
        return engineType;
    }
}
