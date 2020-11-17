package ru.kusiapkulov.blockEleven.totalArea;

public class LineBrokeChild extends LineBroke {

    public LineBrokeChild(Point... points) {
        super(points);
    }

    public long distance()
    {
        long sum = super.distance();
        sum += distencePoint(points[0], points[this.points.length-1]);
        return sum;
    }
}
