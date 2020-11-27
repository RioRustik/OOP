package ru.kusiapkulov.geometry.blockTen.points;

import java.util.Arrays;

public class Dot
{

    private int[] a;

    public Dot(int x)
    {
        this.a = new int[]{x};
    }
    public Dot(int x, int y)
    {
        this.a = new int[]{x, y};
    }
    public Dot(int x, int y, int z)
    {
        this.a = new int[]{x, y, z};
    }

    public int[] getA() {
        return a;
    }


    @Override
    public String toString() {
        return  Arrays.toString(a);
    }
}
