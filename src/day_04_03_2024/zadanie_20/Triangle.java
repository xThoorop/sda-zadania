package day_04_03_2024.zadanie_20;

public class Triangle extends Shape{


    private double height, width;


    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    double calculatePermiter() {
        return (height*2)+width;
    }

    @Override
    double calculateArea() {
        return (this.height*this.width)/2;
    }
}
