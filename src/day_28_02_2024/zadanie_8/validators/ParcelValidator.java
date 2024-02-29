package day_28_02_2024.zadanie_8.validators;

import day_28_02_2024.zadanie_8.interfaces.Validator;
import day_28_02_2024.zadanie_8.objects.Parcel;


public class ParcelValidator implements Validator {




    @Override
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

    private static void trySendMessage(boolean send, String message){
        if(send){
            System.out.println(message);
        }
    }




}
