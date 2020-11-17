package ru.kusiapkulov.blockOne.house;

public class House {
    private int h;

    public void setH(int h) {
        if(h <= 0) throw new IllegalArgumentException("укажите валидный h");
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public House(int h) {
        setH(h);
        this.h = h;
    }
    private String floor(){
        if(h == 1) return "Дом с "+ h + " этажом";
        else return "Дом с "+ h + " этажами";
    }

    @Override
    public String toString() {
        return floor();
    }
}

