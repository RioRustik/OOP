package ru.kusiapkulov.geometry.blockTen.figures;

import static java.lang.Math.sqrt;

public class Triangle{


    private Point a, b, c;
    private double a1, b1, c1;


    public Triangle(Point a, Point b, Point c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private LineBrokeChild rectangleNew()
    {
        return new LineBrokeChild(
                new Point(a.x, a.y),
                new Point(b.x, b.y),
                new Point(c.x, c.y)
        );
    }

    public double getArea()
    {
        a1 = rectangleNew().distencePoint(a, b);
        b1 = rectangleNew().distencePoint(b, c);
        c1 = rectangleNew().distencePoint(c, a);
        double p = (a1+b1+c1)/2;
        double s = sqrt(p*(p-a1)*(p-b1)*(p-c1));
        return s;
    }

    @Override
    public String toString() {
        return "Triangle со стронами " +
                a1 +
                ", " + b1 +
                ", " + c1;
    }
}
