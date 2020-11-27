package ru.kusiapkulov.blockEleven.roads.townsBlockElevenTen;

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

        townE.addWay(townB, 1);
        townE.addWay(townC, 2);

        System.out.println(townA);
        System.out.println(townB);
        System.out.println(townC);
        System.out.println(townD);
        System.out.println(townE);

        System.out.println(townE.equals(townE));


    }
}
