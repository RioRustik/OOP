package ru.kusiapkulov.bkockFive.brokenLine;

import java.util.Arrays;

public class LineBroke {
    PointBroke[] points;

    public LineBroke(PointBroke...points) {
        this.points = points;
    }

    private long distencePoint(PointBroke a, PointBroke b)
    {
        double d1 = 0, d2 = 0;
        long d = 0;
        d1 = a.x - b.x;
        d2 = a.y - b.y;
        d = (long) Math.sqrt(Math.pow(d1, 2) + Math.pow(d2, 2));
        return  d;
    }

    public void addNewPoints(PointBroke [] points)
    {
        int oldLength = this.points.length;
        this.points = Arrays.copyOf(this.points, points.length+this.points.length);
        for(int i = oldLength; i<this.points.length; i++)
        {
            this.points[i]= points[i-oldLength];
        }
    }

    public void addNewPoint(PointBroke...points)
    {
        addNewPoints(points);
    }

    public long distance()
    {
        long sum=0;
        for(int i = 0; i < points.length-1; i++){
           sum += distencePoint(points[i], points[i+1]);
        }
        return sum;
    }
    public void length(){
        System.out.println("Длина линии равна: " + distance());
    }

    public String toString() {
        return "Линия " + Arrays.toString(points);
    }
}
