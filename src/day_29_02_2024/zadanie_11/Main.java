package day_29_02_2024.zadanie_11;


import day_29_02_2024.zadanie_11.objects.Circle;
import day_29_02_2024.zadanie_11.objects.MoveDirection;
import day_29_02_2024.zadanie_11.objects.Point2D;

public class Main {


    public static void main(String[] args){
        Circle circle = new Circle(new Point2D(0,0),new Point2D(10,1));
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
        System.out.println("x: " + circle.getCenter().getX() + " y: " + circle.getCenter().getY());
        circle.resize(2);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
        System.out.println("x: " + circle.getCenter().getX() + " y: " + circle.getCenter().getY());
    }
}
