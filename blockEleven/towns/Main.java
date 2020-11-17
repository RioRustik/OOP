package ru.kusiapkulov.blockEleven.towns;

public class Main
{
    public static void main(String [] args)
    {
        Town townA = new Towns("A");
        Town townC = new Town("C");
        Town townB = new Town("B");
        Town townD = new Towns("D");
        Town townE = new Town("E");

        townA.addWay(townB, 1);
        townA.addWay(townC, 2);

        townB.addWay(townC, 3);

        townD.addWay(townB, 4);
        townD.addWay(townE, 5);

        townE.addWay(townC,6);

        System.out.println(townA);
        System.out.println(townB);
        System.out.println(townC);
        System.out.println(townD);
        System.out.println(townE);
    }
}
