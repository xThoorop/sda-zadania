package day_28_02_2024.zadanie_7;

import day_28_02_2024.zadanie_7.exceptions.EmptyMagazineException;
import day_28_02_2024.zadanie_7.objects.Gun;
import day_28_02_2024.zadanie_7.objects.Magazine;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Main {

    /*
    ZADANIE 7.
Stwórz klasę imitującą magazynek do broni. Klasa powinna mieć możliwość definiowania rozmiaru magazynka za pomocą konstruktora. Zaimplementuj metody:
loadBullet(String bullet) → dodawanie naboju do magazynka, nie pozwala załadować więcej naboi niż wynosi pojemność magazynka
isLoaded() → zwraca informację o tym czy broń jest naładowana (przynajmniej jeden nabój) czy nie
shot() → jedno wywołanie wystrzeliwuje (wypisuje w konsoli wartość string) jeden - ostatni załadowany nabój i przygotowuje kolejny, załadowany przed ostatnim, jeżeli nie ma więcej nabojów to wypisuje w konsoli “pusty magazynek”
     */

    public static void main(String[] args) throws InterruptedException {
        Magazine magazine = new Magazine(10);
        magazine.setBullets(2);//+1 zaladowana aktualnie
        Gun gun = new Gun(magazine);
        Scanner scanner = new Scanner(System.in);
        System.out.println("komendy: strzel, naladuj <liczba>");
        while(true){
            String command = scanner.nextLine();
            if(command.equals("strzel")){
                try {
                    gun.shot();
                }catch (EmptyMagazineException e){
                    System.out.println(e.getMessage());
                }
            }else if (command.startsWith("naladuj")){
                gun.loadBullet(command.split(" ")[1]);
            }
        }
    }
}
