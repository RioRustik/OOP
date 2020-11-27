package ru.kusiapkulov.geometry.blockFive.figureSquare;

import java.util.Arrays;

public class LineBroke {
    Point[] points;

    public LineBroke(Point...points) {
        this.points = points;
    }

    private long distencePoint(Point a, Point b)
    {
        double d1 = 0, d2 = 0;
        long d = 0;
        d1 = a.x - b.x;
        d2 = a.y - b.y;
        d = (long) Math.sqrt(Math.pow(d1, 2) + Math.pow(d2, 2));
        return  d;
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

    public Point getPointByIndex(int index)
    {
        return points[index];
    }

    public String toString() {
        return "Квадрат " + Arrays.toString(points)+"\nДлина: "+ distance();
    }
}
