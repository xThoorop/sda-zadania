package day_04_03_2024.zadanie_20;

public class Main {


    /*
    ZADANIE 20.
Stwórz abstrakcyjną klasę Shape wraz z abstrakcyjnymi metodami calculatePerimeter() służącą do obliczania obwodu oraz calculateArea() służącą do obliczania powierzchni.
Stwórz klasy Rectangle, Triangle, Hexagon, rozszerzając klasę Shape, odpowiednio implementując metody abstrakcyjne. Sprawdź poprawność działania.
     */
    public static void main(String[] args) {
       // Triangle triangle = new Triangle(2,1);
        //System.out.println(triangle.calculatePermiter());
        Hexagon hexagon = new Hexagon(1);
        System.out.println(hexagon.calculateArea() + " " + hexagon.calculatePermiter());
        }
}
