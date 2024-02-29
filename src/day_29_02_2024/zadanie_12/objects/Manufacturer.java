package day_29_02_2024.zadanie_12.objects;

import java.time.LocalDate;
import java.util.Objects;

public class Manufacturer {

    /*
    Stwórz klasę Manufacturer, która będzie zawierać pola: nazwa, rok założenia, kraj. Uwzględnij wszystkie niezbędne
 metody oraz parametry konstruktora. Zaimplementuj metody hashCode() i equals() .
     */

    private String name;
    private LocalDate yearOfFoundation;
    private String country;


    public Manufacturer(String name, LocalDate yearOfFoundation, String country) {
        this.name = name;
        this.yearOfFoundation = yearOfFoundation;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return yearOfFoundation == that.yearOfFoundation && Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfFoundation, country);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                ", country='" + country + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public LocalDate getYearOfFoundation() {
        return yearOfFoundation;
    }

    public String getCountry() {
        return country;
    }
}
