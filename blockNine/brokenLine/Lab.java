package ru.kusiapkulov.blockNine.brokenLine;

public class Lab {
    public static void main(String[] arrg) {
        PointBroke b = new PointBroke(2,8);
        PointBroke c = new PointBroke(5,3);

        LineBroke l =  new LineBroke(new PointBroke(1,5), b, c);
        System.out.println(l);
        l.length();
        l.addNewPoint(new PointBroke(8,9));
        System.out.println(l);
        l.length();

        LineBrokeChild l1 =  new LineBrokeChild(new PointBroke(1,5), b, c);
        System.out.println(l1);
        l1.length();
        l1.addNewPoint(new PointBroke(8,9));
        System.out.println(l1);
        l1.length();
    }
}
