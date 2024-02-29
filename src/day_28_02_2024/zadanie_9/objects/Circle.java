package day_28_02_2024.zadanie_9.objects;

public class Circle {

    private Point2D center;

    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }
    /*
    ZADANIE 9.
Stwórz klasę Point2D posiadającą pola double x, double y, gettery, settery oraz konstruktor. Następnie stwórz klasę Circle, która będzie miała konstruktor: Circle(Point2D center, Point2D point)
Pierwszy parametr określa środek koła, drugi jest dowolnym punktem na okręgu. Na podstawie tych punktów, klasa Circle ma określać:
• promień okręgu przy wywołaniu metody double getRadius()
• obwód okręgu przy wywołaniu metody double getPerimeter()
• pole okręgu przy wywołaniu metody double getArea()
• (trudniejsze) trzy punkty na okręgu co 90 stopni od punktu podanego przy wywołaniu metody List getSlicePoints()
     */


    public double promien(){
        Math.pow(this.center.getX(),this.point.getX());
        double wynikx = 0d;
        if(this.center.getX() < this.point.getX()){
            wynikx = Math.pow(this.point.getX(),this.center.getX());
        }else {
            wynikx = Math.pow(this.center.getX(),this.point.getX());
        }
        double wyniky = 0d;
        if(this.center.getY() < this.point.getY()){
            wyniky = Math.pow(this.point.getY(),this.center.getY());
        }else {
            wyniky = Math.pow(this.center.getY(),this.point.getY());

        }
        return wynikx+wyniky;
    }
   /* public double promien(){
        Math.pow(this.center.getX(),this.point.getX());
        double wynikx = 0d;
        if(this.center.getX() < this.point.getX()){
            wynikx = this.point.getX() - this.center.getX();
        }else {
            wynikx = this.center.getX() - this.point.getX();

        }
        double wyniky = 0d;
        if(this.center.getY() < this.point.getY()){
            wyniky = this.point.getY() - this.center.getY();
        }else {
            wyniky = this.center.getY() - this.point.getY();

        }
        return wynikx+wyniky;
    }*/

    public double obwod(){
        return Math.round((2 * Math.PI * promien()) * 100.0) / 100.0;
    }

    public double pole(){
        return Math.round((Math.PI * promien() * promien()) * 100.0) / 100.0;

    }

}
