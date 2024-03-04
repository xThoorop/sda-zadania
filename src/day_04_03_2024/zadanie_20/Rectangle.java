package day_04_03_2024.zadanie_20;

public class Rectangle extends Shape{


    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    double calculatePermiter() {
        return (this.height*2)+this.width*2;
    }

    @Override
    double calculateArea() {
        return this.height*this.width;
    }
}
