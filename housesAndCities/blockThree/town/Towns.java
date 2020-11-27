package ru.kusiapkulov.housesAndCities.blockThree.town;

import java.util.Arrays;

public class Towns {
    private int countWay = 0;
    String name;
    Way[] way = new Way[10];

    Towns(String name) {
        this.name = name;
    }

    public void addWay(Towns town, int cost)
    {
        if(countWay >= way.length){
           way = Arrays.copyOf(way, way.length*2);
        }
        way[countWay] = new Way(town, cost);
        countWay = countWay + 1;

    }
        @Override
        public String toString() {
            return "Town "+name + " " + Arrays.toString(way);
        }
}
