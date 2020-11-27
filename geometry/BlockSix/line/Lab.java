package ru.kusiapkulov.geometry.BlockSix.line;

public class Lab {

    public static void main(String[] arrg) {
        Point p1 = new Point(1,1);
        Point p2 = new Point(10,15);
        Line l2 = new Line(p1,p2);
        System.out.println(l2);
//        System.out.println(l2.getPointA());
//        System.out.println(l2.getPointB());
//        l2.setPointA(2,2);
//        l2.setPointB(2,55);
//        System.out.println(l2);
//        System.out.println(l2.getPointA());
        Line l = new Line(p1, p2);
        System.out.println(l);
        p1.setX(0);
        p1.setY(0);
        System.out.println(l);
        System.out.println(l2);

    }
}
