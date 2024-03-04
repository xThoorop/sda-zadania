package day_04_03_2024.zadanie_17;

import day_04_03_2024.zadanie_17.enums.ConversionType;

public class MeasurementConverter {


    /*
    convert(int value, ConvertionType conversionType) i na podstawie przekazanej wartości oraz typu konwersji, korzystała z Convertera danego typu i zwracała wynik.

     */



    public static float convert(int value, ConversionType conversionType){
        return conversionType.getValue()*value;
    }

}
