package ru.kusiapkulov.blockEleven.all;

import java.util.Objects;

public class Line implements TotalLength {
    private Point a,  b;

    public Line(Point a, Point b) {
        this(a.getX(), a.getY(), b.getX(), b.getY());
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.a = new Point(x1,y1);
        this.b = new Point(x2,y2);
    }

    public Point getPointA(){
        return a;
    }

    public Point getPointB(){
        return b;
    }

    public void setPointA(int x1, int y1){
        this.a = new Point(x1,y1);
    }

    public void setPointB(int x2, int y2){
        this.b = new Point(x2,y2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(a.getX(), line.a.getX()) &&
                Objects.equals(b.getX(), line.b.getX()) &&
                Objects.equals(a.getY(), line.a.getY()) &&
                Objects.equals(b.getY(), line.b.getY());
    }

    public int length(){
        int d;
        double d1 = b.getX() - a.getX();
        double d2 = b.getY() - a.getY();
        d = (int) Math.sqrt(Math.pow(d1, 2) + Math.pow(d2, 2));
        return d;
    }

    public String toString() {
        return a + " " + b;
    }

}
