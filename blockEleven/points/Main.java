package ru.kusiapkulov.blockEleven.points;

public class Main
{

    public static void main(String [] args)
    {
        Dot point = new Dot(5);
        Dot point1 = new Dot(2, 4);
        Dot point3 = new Dot(2, 4);
        Dot point2 = new Dot(7,9,8);

        System.out.println(point3.equals(point1));

        Boolean hash = point1.hashCode() == point3.hashCode();
        System.out.println(hash);

        System.out.println(point);
        System.out.println(point1);
        System.out.println(point2);

    }
}
