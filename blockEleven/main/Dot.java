package ru.kusiapkulov.blockEleven.main;

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
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Dot dot = (Dot) o;
        return Arrays.equals(a, dot.a);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(a);
    }

    @Override
    public String toString() {
        return  Arrays.toString(a);
    }
}
