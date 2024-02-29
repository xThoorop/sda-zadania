package day_29_02_2024.objects;

import day_29_02_2024.interfaces.Movable;

public class Point2D implements Movable {

    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public void moveDirection(MoveDirection moveDirection) {
        double newX = this.getX() + moveDirection.getX();
        double newY = this.getY() + moveDirection.getY();
        this.x = newX;
        this.y = newY;
    }
}
