package ru.kusiapkulov.bkockFive.figureSquare;

public class Main
{
    public static void main(String [] args)
    {
        Square square = new Square(new Point(5,3), 23);
        System.out.println(square);
        LineBroke lineBroke = square.lineSquare();
        System.out.println(lineBroke);
        Point p = lineBroke.getPointByIndex(3);
        p.setX(15);
        p.setY(25);
        System.out.println(lineBroke);

    }
}
