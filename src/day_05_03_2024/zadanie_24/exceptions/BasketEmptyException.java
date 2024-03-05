package day_05_03_2024.zadanie_24.exceptions;

public class BasketEmptyException extends Exception{


    public BasketEmptyException() {
        super("koszyk jest pusty!");

    }
}
