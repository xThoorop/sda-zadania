package day_29_02_2024.zadanie_10;


import day_29_02_2024.zadanie_10.objects.Circle;
import day_29_02_2024.zadanie_10.objects.MoveDirection;
import day_29_02_2024.zadanie_10.objects.Point2D;

public class Main {


    public static void main(String[] args){

        Point2D point2D = new Point2D(0,0);
        System.out.println(point2D.toString());
        point2D.moveDirection(new MoveDirection(1,1));
        Circle circle = new Circle(new Point2D(0,0),new Point2D(0,1));
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
        System.out.println("x: " + circle.getCenter().getX() + " y: " + circle.getCenter().getY());
        circle.moveDirection(new MoveDirection(1,4));
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
        System.out.println("x: " + circle.getCenter().getX() + " y: " + circle.getCenter().getY());
    }
}
