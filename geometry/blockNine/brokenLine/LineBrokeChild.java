package ru.kusiapkulov.geometry.blockNine.brokenLine;

public class LineBrokeChild extends LineBroke {

    public LineBrokeChild(PointBroke... points) {
        super(points);
    }

    public long distance()
    {
        long sum = super.distance();
        sum += distencePoint(points[0], points[this.points.length-1]);
        return sum;
    }
}
