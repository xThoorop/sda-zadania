package day_28_02_2024.zadanie_7.poprawne_wykonanie;

public class Main {


    public static void main(String[] args){
        FirearmMagazine magazine = new FirearmMagazine(3);

        magazine.loadBullet("1");
        magazine.loadBullet("2");
        magazine.loadBullet("3");

        System.out.println("Is loaded: " + magazine.isLoaded());

        magazine.shot();
        magazine.shot();
        magazine.shot();
        magazine.shot();

        System.out.println("Is loaded: " + magazine.isLoaded());
    }
}
