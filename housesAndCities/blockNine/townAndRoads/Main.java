package ru.kusiapkulov.housesAndCities.blockNine.townAndRoads;


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

        System.out.println(b);
        System.out.println(c);
        c.removeWay(a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);







//        a.way = new Way[2];
//        a.way[0] = new Way(b, 5);
//        a.way[1] = new Way(d, 6);
//        System.out.println(a);
//
//        b.way = new Way[3];
//        b.way[0] = new Way(a, 5);
//        b.way[1] = new Way(f, 1);
//        b.way[2] = new Way(c, 3);
//        System.out.println(b);
//
//        c.way = new Way[2];
//        c.way[0] = new Way(b, 3);
//        c.way[1] = new Way(d, 4);
//        System.out.println(c);
//
//        d.way = new Way[3];
//        d.way[0] = new Way(a, 6);
//        d.way[1] = new Way(e, 2);
//        d.way[2] = new Way(c, 4);
//        System.out.println(d);
//
//        e.way = new Way[2];
//        e.way[0] = new Way(f, 2);
//        e.way[1] = new Way(d, 2);
//        System.out.println(e);
//
//        f.way = new Way[3];
//        f.way[0] = new Way(a, 1);
//        f.way[1] = new Way(e, 2);
//        f.way[2] = new Way(b, 1);
//        System.out.println(f);

//        House house = new House(1);
//        System.out.println(house);
//        house.setH(5);
//        System.out.println(house);
//        house.setH(10);
//        System.out.println(house.getH());

    }
}
