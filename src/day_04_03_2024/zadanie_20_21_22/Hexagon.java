package day_04_03_2024.zadanie_20_i_21;

public class Hexagon extends Shape{


    private double length;


    public Hexagon(double length) {
        this.length = length*6;
    }


    @Override
    double calculatePermiter() {
        return length*6;
    }

    @Override
    double calculateArea() {
        return  (3 * Math.sqrt(3) * this.length * this.length) / 2;
    }
}
