package day_28_02_2024.zadanie_8;

import day_28_02_2024.zadanie_8.objects.Parcel;
import day_28_02_2024.zadanie_8.validators.ParcelValidator;

public class Main {


    public static void main(String[] args){
        Parcel parcel = new Parcel(30,30,30,10,true);
        ParcelValidator validator = new ParcelValidator();
        validator.validate(parcel,true);
    }
}
