package ru.kusiapkulov.blockEleven.roads.townBsix;

public class Way {
    Towns town;
    int cost;

    public Way(Towns town, int cost) {
        this.town = town;
        this.cost = cost;
    }

    public Towns getTown() {
        return town;
    }

    public int getCost() {
        return cost;
    }

    public void setTown(Towns town) {
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
