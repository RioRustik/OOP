package ru.kusiapkulov.blockEleven.towns;

import java.util.Arrays;
import java.util.Objects;

public class Towns extends Town{
    private int countWay = 0;
   // String name;
    Way[] way = new Way[1];

    Towns(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Towns towns = (Towns) o;
        return Objects.equals(name, towns.name);
    }

    public void addWay(Town town, int cost)
    {
        for(Way t : way)
        {
            if(t != null && t.getTown().equals(town)){
                return;
            }
        }
        if(countWay >= way.length){
           way = Arrays.copyOf(way, way.length+1);
        }
        way[countWay] = new Way(town, cost);
        town.addWay(this, cost);
        countWay = countWay + 1;
    }

    public void removeWay(Town town)
    {
        for(int i = 0; i < way.length; i++)
        {
            Way t = way[i];
            if(t != null && t.getTown().equals(town)){
              way[i] = null;
              t.getTown().removeWay(this);
              return;
            }
        }
    }

        @Override
        public String toString() {
            return "Town "+getName() + " " + Arrays.toString(way);
        }
}
