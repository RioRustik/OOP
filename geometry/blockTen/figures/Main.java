package ru.kusiapkulov.geometry.blockTen.figures;

public class Main
{

    public static void main(String [] args)
    {
//        Point p = new Point(3,2);
//        Circle circle = new Circle(p, 5);
//        System.out.println(circle);
//        System.out.println(circle.getArea());
//        System.out.println(circle.getA());
//
//        Point p1 = circle.getA();
//        p1.x = -99;
//        System.out.println(circle.getA());
//
//        Point p2 = new Point(6, 8);
//        circle.setA(p2);
//        p2.x = 99;
//        System.out.println(circle.getA());

//        Point p = new Point(3,2);
//        Rectangle rectangle = new Rectangle(p, 5, 3);
//        System.out.println(rectangle);
//        System.out.println(rectangle.getArea());
//
//        Point p = new Point(3,2);
//        Square square = new Square(p, 5,5);
//        System.out.println(square);
//        System.out.println(square.getArea());



        Triangle triangle = new Triangle(new Point(3,2), new Point(5,6), new Point(2,5));
        System.out.println(triangle);
        System.out.println(triangle.getArea());





    }

}
