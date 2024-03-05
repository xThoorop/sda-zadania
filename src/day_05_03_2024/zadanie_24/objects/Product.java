package day_05_03_2024.zadanie_24.objects;

public class Product {


    private String name;
    private double price;
    private double weight;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.weight = name.length();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
