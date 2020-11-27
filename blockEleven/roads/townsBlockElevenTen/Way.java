package ru.kusiapkulov.blockEleven.roads.townsBlockElevenTen;

public class Way {
    Town town;
    int cost;

    public Way(Town town, int cost) {
        this.town = town;
        this.cost = cost;
    }

    public Town getTown() {
        return town;
    }

    public int getCost() {
        return cost;
    }

    public void setTown(Town town) {
        this.town = town;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
        public String toString() {
            return this.town.name+ "=" + this.cost;
        }
}
