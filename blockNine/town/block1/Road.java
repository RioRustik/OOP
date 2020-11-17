package ru.kusiapkulov.blockNine.town.block1;

public class Road {
        String to;
        int cost;

        public Road(String to, int cost) {
            this.to = to;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return to + "=" + cost;
        }
    }

