package ru.kusiapkulov.bkockFive.figureSquare;

public class Square {

    private Point a;
    private int length;

    public Square(Point a, int length)
    {
        this.a = a;
        this.length = length;
    }

    @Override
    public String toString()
    {
        return "Квадрат в точке" + a +
                ", со стороной " + length +
                "\n";
    }

    public LineBroke lineSquare()
    {
        return new LineBroke(new Point(this.a.x, this.a.y),
                new Point(this.a.x+this.length, this.a.y),
                new Point(this.a.x+this.length, this.a.y-this.length),
                new Point(this.a.x, this.a.y-this.length));
    }
}
