package ru.kusiapkulov.bkockFive.figureSquare;

public class Point {

        int x;
        int y;

        Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
            return "{" + x + ";" + y + "}";
        }
}
