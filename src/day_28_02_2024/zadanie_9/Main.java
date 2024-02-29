package day_28_02_2024.zadanie_9;

import day_28_02_2024.zadanie_9.objects.Circle;
import day_28_02_2024.zadanie_9.objects.Point2D;

public class Main {


    public static void main(String[] args) {
        Point2D center = new Point2D(-1, 1);
        Point2D point = new Point2D(2,2);
        Circle circle = new Circle(center,point);
        System.out.println(circle.promien());
    }
}
