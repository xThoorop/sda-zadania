package day_04_03_2024.zadanie_20_21_22;

public class Triangle extends Shape{


    private double a,b,c;


    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }



    @Override
    double calculatePermiter() {
        return a + b + c;
    }

    @Override
    double calculateArea() {
        double v = calculatePermiter() / 2;
        return Math.sqrt(v * (v - this.a) * (v - this.b) * (v - this.c));    }
}
