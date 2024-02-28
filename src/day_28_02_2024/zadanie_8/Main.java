package day_28_02_2024.zadanie_8;

import day_28_02_2024.zadanie_8.objects.Parcel;
import day_28_02_2024.zadanie_8.validators.Validator;

public class Main {


    public static void main(String[] args){
        Parcel parcel = new Parcel(30,30,30,10,true);
        Validator validator = new Validator();
        validator.validate(parcel,true);
    }
}
