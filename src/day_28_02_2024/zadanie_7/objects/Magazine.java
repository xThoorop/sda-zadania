package day_28_02_2024.zadanie_7.objects;

public class Magazine {


    /*
    ZADANIE 7.
Stwórz klasę imitującą magazynek do broni. Klasa powinna mieć możliwość definiowania rozmiaru magazynka za pomocą konstruktora. Zaimplementuj metody:
loadBullet(String bullet) → dodawanie naboju do magazynka, nie pozwala załadować więcej naboi niż wynosi pojemność magazynka
isLoaded() → zwraca informację o tym czy broń jest naładowana (przynajmniej jeden nabój) czy nie
shot() → jedno wywołanie wystrzeliwuje
 (wypisuje w konsoli wartość string) jeden - ostatni załadowany nabój i przygotowuje kolejny, załadowany przed ostatnim, jeżeli nie ma więcej nabojów to wypisuje w konsoli “pusty magazynek”
     */

    private int max_bullets;
    private int bullets;
    private boolean isLoaded;


    public Magazine(int max_bullets) {
        this.max_bullets = max_bullets;
        this.bullets = max_bullets-1;
        this.isLoaded = true;
    }
    public Magazine(Magazine magazine) {
        this.max_bullets = magazine.getMax_bullets();
        this.bullets = magazine.getBullets();
        this.isLoaded = magazine.isLoaded;
    }

    public boolean isLoaded(){
        return this.isLoaded;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    public int getMax_bullets() {
        return max_bullets;
    }

    public int getBullets() {
        return bullets;
    }

    public void loadBullet(String bullet){
        int bullets = 0;
        try{
            bullets = Integer.parseInt(bullet);
        }catch (NumberFormatException e){
            System.out.println("!loadBullet(int)");
        }
        if(this.bullets + bullets > this.max_bullets){
            System.out.println("Nie mozesz wsadzic tu tyle pociskow!");
            return;
        }
        addBullets(bullets);
        if(!this.isLoaded) {
            this.bullets--;
            this.setLoaded(true);
        }
        System.out.println("Zaladowano (" + this.bullets+"/"+this.max_bullets+")");
    }

    private void addBullets(int bullets){
        this.bullets+=bullets;
    }


}
