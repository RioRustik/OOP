package ru.kusiapkulov.blockEleven.main;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle implements Area {

    private Point a;
    private int radius;

    public Point getA() {
        return new Point(a.x, a.y);
    }

    public int getRadius() {
        return radius;
    }

    public void setA(Point a) {
        this.a = new Point(a.x, a.y);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(Point a, int radius) {
        this.a = a;
        this.radius = radius;
    }

    public double getArea(){
        return PI*pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Круг посторенный в координате " + a +
                ", с радиусом = " + radius;
    }
}
