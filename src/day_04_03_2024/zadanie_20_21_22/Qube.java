package day_04_03_2024.zadanie_20_21_22;

public class Qube extends Shape3D{
    private double a;

    private double volume;

    public Qube(double a) {
        this.a = a;
        this.volume = calculateVolume();
    }




    @Override
    public double calculateArea() {
        return 6 * Math.pow(a, 2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(a, 3);
    }



    @Override
    public double calculatePermiter() {
        throw new RuntimeException();
    }


    @Override
    public Cone fill() {
        return null;
    }
}
