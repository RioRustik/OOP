package ru.kusiapkulov.bkockSix.figureSquare;

public class Square {

    private Point a;
    private int length;

    public Square(Point a, int length)
    {
        this.a = a;
        setLength(length);
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        if(length <= 0 ) throw new IllegalArgumentException(String.valueOf(length));
        this.length = length;
    }

    @Override
    public String toString()
    {
        return "Квадрат в точке" + a +
                ", со стороной " + length +
                "\n" + lineSquare();
    }

    private LineBroke lineSquare()
    {
        return new LineBroke(new Point(this.a.x, this.a.y),
                new Point(this.a.x+this.length, this.a.y),
                new Point(this.a.x+this.length, this.a.y-this.length),
                new Point(this.a.x, this.a.y-this.length));
    }
}
