package day_28_02_2024.zadanie_8.objects;

import day_28_02_2024.zadanie_8.interfaces.Validator;
import day_28_02_2024.zadanie_8.validators.ParcelValidator;

public class Parcel {

    private int xLenght;
    private int yLenght;
    private int zLenght;
    private float weight;
    private boolean isExpress;


    public Parcel(int xLenght, int yLenght, int zLenght, float weight, boolean isExpress) {
        this.xLenght = xLenght;
        this.yLenght = yLenght;
        this.zLenght = zLenght;
        this.weight = weight;
        this.isExpress = isExpress;
    }


    public int getXLenght() {
        return xLenght;
    }

    public int getYLenght() {
        return yLenght;
    }

    public int getZLenght() {
        return zLenght;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isExpress() {
        return isExpress;
    }
}
