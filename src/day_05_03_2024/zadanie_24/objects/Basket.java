package day_05_03_2024.zadanie_24.objects;

import day_05_03_2024.zadanie_24.exceptions.BasketEmptyException;
import day_05_03_2024.zadanie_24.exceptions.BasketFullException;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    /*
        ZADANIE 24.
Stwórz klasę Basket, która imituje koszyk i przechowuje aktualną ilość elementów w koszyku.
Dodaj metodę addToBasket(), która dodaje element do koszyka (zwiększając aktualny stan o 1)
 oraz metodę removeFromBasket(), która usuwa element z koszyka (zmniejszając aktualny stan o 1).
Koszyk może przechowywać od 0 do 10 elementów. W przypadku, kiedy użytkownik chce wykonać akcję usunięcia przy stanie 0
lub dodania przy stanie 10, rzuć odpowiedni runtime exception (BasketFullException lub BasketEmptyException).
     */

    private List<Product> productList = new ArrayList<>();
    private int maxProducts;

    public Basket(int maxProducts) {
        this.maxProducts = maxProducts;
    }

    public void addToBasket(Product product) throws BasketFullException {
        if(productList.size()==10) throw new BasketFullException();
        productList.add(product);
        System.out.println("dodano " + product.getName() + " (" + productList.size()+")");
    }

    public void removeFromBasket(Product product) throws BasketEmptyException {
        if(productList.isEmpty()) throw new BasketEmptyException();
        if(product==null){
            removeFromBasket();
            return;
        }else {
            productList.remove(product);
        }
        System.out.println("usunieto " + product.getName() + " (" + productList.size()+")");

    }
    public void removeFromBasket() throws BasketEmptyException {
        if(productList.isEmpty()) throw new BasketEmptyException();
        Product product = productList.remove(productList.size()-1);
        System.out.println("usunieto " + product.getName() + " (" + productList.size()+")");

    }

    @Override
    public String toString() {
        return "Basket{" +
                "productList=" + productList +
                ", maxProducts=" + maxProducts +
                '}';
    }
}
