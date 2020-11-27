package ru.kusiapkulov.blockEleven.roads.townBsix;

import java.util.Arrays;

public class Towns {
    private int countWay = 0;
    String name;
    Way[] way = new Way[1];

    Towns(String name) {
        this.name = name;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Towns towns = (Towns) o;
        return Arrays.toString(way).equals(Arrays.toString(towns.way));
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public void addWay(Towns town, int cost)
    {
        for(Way t : way)
        {
            if(t != null && t.getTown() == town){
                return;
            }
        }
        if(countWay >= way.length){
           way = Arrays.copyOf(way, way.length+1);
        }
        way[countWay] = new Way(town, cost);
        countWay = countWay + 1;
    }

    public void removeWay(Towns town)
    {
        for(int i = 0; i < way.length; i++)
        {
            Way t = way[i];
            if(t != null && t.getTown() == town){
              way[i] = null;
              t.getTown().removeWay(this);
              return;
            }
        }
    }

        @Override
        public String toString() {
            return "Town "+name + " " + Arrays.toString(way);
        }
}
