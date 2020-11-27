package ru.kusiapkulov.geometry.blockTen.points;

public class Main
{

    public static void main(String [] args)
    {
        Dot point = new Dot(5);
        Dot point1 = new Dot(2, 4);
        Dot point2 = new Dot(7,9,8);
        System.out.println(point);
        System.out.println(point1);
        System.out.println(point2);

        ExsDot pointExs = new ExsDot(5, new Time(2,5,4));
        ExsDot pointExs1 = new ExsDot(2,4, new Time(2,5,4));
        ExsDot pointExs2 = new ExsDot(7,9,8,new Time(2,5,4));
        System.out.println(pointExs);
        System.out.println(pointExs1);
        System.out.println(pointExs2);

    }
}
