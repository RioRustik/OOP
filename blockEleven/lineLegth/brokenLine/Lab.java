package ru.kusiapkulov.blockEleven.lineLegth.brokenLine;

public class Lab {
    public static void main(String[] arrg) {
       PointBroke b = new PointBroke(2,8);
        PointBroke c = new PointBroke(5,3);

        LineBroke l =  new LineBroke(new PointBroke(1,5), b, c);
        System.out.println(l);
        System.out.println(l.length());
//        LineBroke l2 = new LineBroke();
//        System.out.println(l2);
//        l2.length();
//        l2.addNewPoint(b, c);
//        System.out.println(l2);
//        l2.length();


    }
}
