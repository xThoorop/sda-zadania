package day_28_02_2024.zadanie_7.objects;

import day_28_02_2024.zadanie_7.exceptions.EmptyMagazineException;

import java.util.EmptyStackException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Gun extends Magazine{



    public Gun(int max_bullets) {
        super(max_bullets);
    }
    public Gun(Magazine magazine) {
        super(magazine);
    }

    private boolean loading=false;

    public void shot() throws InterruptedException {
        if(isLoading()){
            if(super.getBullets()==0){
                throw new EmptyMagazineException();

            }else {
                System.out.println("Czekaj, jeszcze przeladowywujesz!");
            }

            return;
        }
        if(super.isLoaded()){
            System.out.println("Strzal " + super.getBullets() + "/" + super.getMax_bullets());
            super.setLoaded(false);
            if(super.getBullets()>0) {
                this.loading=true;
                ExecutorService thread = Executors.newSingleThreadExecutor();
                thread.submit(() -> {
                    try {
                        Thread.sleep(2000L);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    super.setLoaded(true);
                    super.setBullets(super.getBullets() - 1);
                    this.loading=false;

                });
                thread.shutdown();
            }else {
                if(!isLoading()){
                    this.loading = false;
                    throw new EmptyMagazineException();
                }



            }
            }
    }

    public boolean isLoading() {
        return loading;
    }
    /*
        /*
    ZADANIE 7.
Stwórz klasę imitującą magazynek do broni. Klasa powinna mieć możliwość definiowania rozmiaru magazynka za pomocą konstruktora. Zaimplementuj metody:
loadBullet(String bullet) → dodawanie naboju do magazynka, nie pozwala załadować więcej naboi niż wynosi pojemność magazynka
isLoaded() → zwraca informację o tym czy broń jest naładowana (przynajmniej jeden nabój) czy nie
shot() → jedno wywołanie wystrzeliwuje
 (wypisuje w konsoli wartość string) jeden - ostatni załadowany nabój i przygotowuje kolejny, załadowany przed ostatnim, jeżeli nie ma więcej nabojów to wypisuje w konsoli “pusty magazynek”
     */

}
