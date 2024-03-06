package day_04_03_2024.zadanie_20_21_22;

public abstract class Shape3D extends Shape implements Fillabe{


    abstract double calculateVolume();


    /*
    Metoda fill() powinna przyjmować parametr np. int i sprawdzać, czy po, akcja napełnienia figury:
• wleje za dużo wody do figury i przeleje,
• napełni figurę wodą po brzegi,
• wleje za mało wody.
Dla każdej sytuacji powinna zapisać informację o stanie w konsoli. Użyj metody calculateVolume().
     */
    public State fill(int value){
        return null;
    }

}
