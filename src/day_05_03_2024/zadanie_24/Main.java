package day_05_03_2024.zadanie_24;

import day_05_03_2024.zadanie_24.exceptions.BasketEmptyException;
import day_05_03_2024.zadanie_24.exceptions.BasketFullException;
import day_05_03_2024.zadanie_24.objects.Basket;
import day_05_03_2024.zadanie_24.objects.Product;

public class Main {

    /*
    ZADANIE 24.
Stwórz klasę Basket, która imituje koszyk i przechowuje aktualną ilość elementów w koszyku.
Dodaj metodę addToBasket(), która dodaje element do koszyka (zwiększając aktualny stan o 1)
 oraz metodę removeFromBasket(), która usuwa element z koszyka (zmniejszając aktualny stan o 1).
Koszyk może przechowywać od 0 do 10 elementów. W przypadku, kiedy użytkownik chce wykonać akcję usunięcia przy stanie 0
lub dodania przy stanie 10, rzuć odpowiedni runtime exception (BasketFullException lub BasketEmptyException).
     */
    public static void main(String[] args) throws BasketFullException {
        test();
    }



    public static void test() throws BasketFullException {
        Basket basket = new Basket(10);
        try {
            for (int i = 0; i < 10; i++) {
                basket.addToBasket(new Product("Bulka", 2));
            }
            for (int i = 0; i < 12; i++) {
                basket.removeFromBasket();
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(basket.toString());
    }
}
