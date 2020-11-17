package ru.kusiapkulov.blockEleven.totalArea;

public class Main
{

    public static void main(String [] args)
    {
        Point p = new Point(3,2);
        Circle circle = new Circle(p, 5);

        System.out.println(circle.getArea());

        Point p3 = new Point(3,2);
        Rectangle rectangle = new Rectangle(p3, 5, 3);

        System.out.println(rectangle.getArea());

        Point p4 = new Point(3,2);
        Square square = new Square(p4, 5,5);

        System.out.println(square.getArea());

        System.out.println(test(circle, rectangle, square));
    }
    public static double test(Figures ...figures)
    {
        double allArea = 0;
        for(Figures i: figures)
        {
            allArea += i.getArea();
        }
        return allArea;
    }
}
