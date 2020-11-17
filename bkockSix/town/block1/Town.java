package ru.kusiapkulov.bkockSix.town.block1;

import java.util.Arrays;

public class Town {

    String name;
    Road[] roads;

    public Town(String name, Road[] roads) {
        this.name = name;
        this.roads = roads;
    }

    @Override
    public String toString() {
        return "Town " + name +" "+ Arrays.toString(roads);
    }
}
