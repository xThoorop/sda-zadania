package day_04_03_2024.zadanie_20_21_22;

public class Cone extends Shape3D{

    private double radius;

    private double height;
    private double creatingCone;
    private double volume;

    public Cone(double radius, double height, double creatingCone) {
        this.radius = radius;
        this.height = height;
        this.creatingCone = creatingCone;
        this.volume = calculateVolume();
    }

    @Override
    public double calculateVolume() {
        return (double) 1 / 3 * (Math.PI * Math.pow(radius, 2)) * height;
    }




    @Override
    public double calculatePermiter() {
        throw new RuntimeException();
    }

    @Override
    public double calculateArea() {
        return (Math.PI * Math.pow(radius, 2)) + (Math.PI * this.radius * this.creatingCone);
    }


    @Override
    public Cone fill() {
        return null;
    }
}
