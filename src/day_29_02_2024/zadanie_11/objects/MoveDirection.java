package day_29_02_2024.zadanie_11.objects;

public class MoveDirection {
    /*
    Stwórz klasę MoveDirection posiadającą pola double x, double y oraz gettery, settery i
konstruktor
     */

    private double x;
    private double y;


    public MoveDirection(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
