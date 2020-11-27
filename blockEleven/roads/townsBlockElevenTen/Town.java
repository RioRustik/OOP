package ru.kusiapkulov.blockEleven.roads.townsBlockElevenTen;

import java.util.Arrays;

@SuppressWarnings("ALL")
public class Town{
    private int countWay = 0;
    String name;
    Way[] way = new Way[1];

    public String getName() {
        return name;
    }

    Town(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
        Town town = (Town) o;
        return Arrays.toString(way) == (Arrays.toString(town.way));
    }


    public void addWay(Town town, int cost)
    {
        for(Way t : way)
        {
            if(t != null && t.getTown()==town){
                return;
            }
        }
        if(countWay >= way.length){
           way = Arrays.copyOf(way, way.length+1);
        }
        way[countWay] = new Way(town, cost);
        countWay = countWay + 1;
    }

    public void removeWay(Town town)
    {
        for(int i = 0; i < way.length; i++)
        {
            Way t = way[i];
            if(t != null && t.getTown()==town){
              way[i] = null;
              t.getTown().removeWay(this);
              return;
            }
        }
    }

        @Override
        public String toString() {
            return Arrays.toString(way);
        }
}
