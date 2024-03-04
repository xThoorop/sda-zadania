package day_04_03_2024.zadanie_17.enums;


/*
ZADANIE 17.
Stwórz klasę enum ConversionType ze stałymi METERS_TO_YARDS, YARDS_TO_METERS, CENTIMETERS_TO_ICHES, INCHES_TO_CENTIMETERS, KILOMETERS_TO_MILES, MILES_TO_KILOMETERS.
Enum powinien posiadać parametr typu Converter służący do przeprowadzania obliczeń dla danego typu.
Następnie stwórz klasę MeasurementConverter, która będzie posiadała metodę
convert(int value, ConvertionType conversionType) i na podstawie przekazanej wartości oraz typu konwersji, korzystała z Convertera danego typu i zwracała wynik.
 */
public enum ConversionType {
    METERS_TO_YARDS(1.0936132983f),
    YARDS_TO_METERS(0.9144f),
    CENTIMETERS_TO_ICHES(0.3937007874f),
    INCHES_TO_CENTIMETERS(2.54f),
    KILOMETERS_TO_MILES(0.6213711922f),
    MILES_TO_KILOMETERS(1.609344f);


    private float value;

    ConversionType(float value){
        this.value = value;
    }


    public static float convert(ConversionType conversionType, float value){
        return conversionType.value*value;
    }



}
