package ru.kusiapkulov.blockEleven.figures;

import java.util.Arrays;

public class Main
{
    public static void main(String [] args)
    {
        Point p = new Point(3,2);
        Point p1 = new Point(5,7);
        Point p2 = new Point(12,16);
        Rectangle rectangle = new Rectangle(p, 5, 3);

        Square square = new Square(p, 5,5);

        LineBroke l = new LineBroke(p,p1);

        Triangle triangle = new Triangle(p2, new Point(5,6), new Point(2,5));

        test(rectangle, l, square, l, triangle);
    }

    public static void test(Test ...figures)
    {
        LineBroke[] all = new LineBroke[3];
        int n=0;
        for(Test i : figures)
        {
            all[n] = i.getPolygonalChain();
            if(n < all.length)
                n++;
            if(n == all.length)
                all = Arrays.copyOf(all, all.length+1);
        }
        System.out.println(Arrays.toString(all));
    }
}
