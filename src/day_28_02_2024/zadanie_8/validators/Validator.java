package day_28_02_2024.zadanie_8.validators;

import day_28_02_2024.zadanie_8.objects.Parcel;

import java.util.function.Function;

public class Validator {
    /*
    ZADANIE 8.
Zaimplementuj interfejs Validator, który będzie zawierać w swojej deklaracji metodę boolean validate(Parcel input). Stwórz klasę Parcel z parametrami:
• int xLength
• int yLength
• int zLength
• float weight
• boolean isExpress
Validator powinien weryfikować czy suma wymiarów (x, y, z) nie
przekracza 300, czy każdy z rozmiarów nie jest mniejszy niż 30,
czy waga nie przekracza 30.0 dla isExpress=false lub 15.0 dla isExpress=true.
W przypadku błędów, powinien o nich poinformować użytkownika.
     */


    public boolean validate(Parcel parcel,boolean showMessages) {
        int sum = parcel.getXLenght() + parcel.getYLenght() + parcel.getZLenght();
        if (sum > 300) {
            trySendMessage(showMessages,"Suma dlugosci przekracza 300!");

            return false;
        }
        if (parcel.getXLenght() < 30 || parcel.getYLenght() < 30 || parcel.getZLenght() < 30) {
            trySendMessage(showMessages,"Dlugosc X lub Y,Z jest mniejsza niz 30!");

            return false;
        }
        if (parcel.isExpress() && parcel.getWeight() > 15) {
            trySendMessage(showMessages,"Waga jest wieksza niz 15");
            return false;
        }
        if (!parcel.isExpress() && parcel.getWeight() > 30) {
            trySendMessage(showMessages,"Waga jest wieksza niz 30");
            return false;
        }
        trySendMessage(showMessages,"Wszystko sie zgadza");
        return true;
    }

    public  void trySendMessage(boolean send,String message){
        if(send){
            System.out.println(message);
        }
    }




}
