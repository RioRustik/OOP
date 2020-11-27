package ru.kusiapkulov.blockEleven.roads.townBsix;


public class Main {

    public static void main(String[] args) {

        Towns a = new Towns("A");
        Towns b = new Towns("B");
        Towns c = new Towns("C");
        Towns d = new Towns("D");
        Towns e = new Towns("E");
        Towns f = new Towns("F");

        a.addWay(b, 6);
        a.addWay(c, 3);
        a.addWay(d, 8);
        System.out.println(a);

        e.addWay(b, 6);
        e.addWay(c, 3);
        e.addWay(d, 8);
        System.out.println(e);

        System.out.println(a.equals(e));


    }
}
