package ru.kusiapkulov.blockEleven.main;

public class LineBrokeChild extends LineBroke {

    public LineBrokeChild(Point... points) {
        super(points);
    }

    public long distance()
    {
        long sum = super.length();
        sum += distencePoint(points[0], points[this.points.length-1]);
        return sum;
    }
}
