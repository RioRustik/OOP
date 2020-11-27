package ru.kusiapkulov.blockEleven.all;

public class Rectangle implements Test, Area
{
    private Point a;
    private int lengthA;
    private int lengthB;

    public LineBroke getPolygonalChain()
    {
        return this.rectangleNew();
    }

    public Rectangle(Point a, int lengthA, int lengthB)
    {
        this.a = a;
        this.lengthA = lengthA;
        this.lengthB = lengthB;
    }

    private LineBroke rectangleNew()
    {
        return new LineBroke(
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
        return rectangleNew()+"";
    }
}
