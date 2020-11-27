package ru.kusiapkulov.housesAndCities.blockFour.town;

import java.util.Arrays;

public class Town {
    String name;
    Way[] way;

    Town(String name, Way...way) {
        this.name = name;
        this.way = way;
    }

    @Override
    public String toString() {
        return this.name + " " + Arrays.toString(this.way);
    }
}
