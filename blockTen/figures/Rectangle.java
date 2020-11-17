package ru.kusiapkulov.blockTen.figures;

public class Rectangle extends Figures
{

    private Point a;
    private int lengthA;
    private int lengthB;

    public Rectangle(Point a, int lengthA, int lengthB)
    {
        this.a = a;
        this.lengthA = lengthA;
        this.lengthB = lengthB;
    }

    private LineBrokeChild rectangleNew()
    {
        return new LineBrokeChild(
                new Point(a.x, a.y),
                new Point(a.x+lengthA, a.y),
                new Point(a.x+lengthA, a.y-lengthB),
                new Point(a.x, a.y-lengthB)
        );
    }

    public double getArea()
    {
        return lengthA*lengthB;
    }

    @Override
    public String toString() {
        return "Прямоугольник с координатами " +
                rectangleNew() +
                ", сторонами " + lengthA +
                " и " + lengthB;
    }
}
