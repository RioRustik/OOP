package ru.kusiapkulov.blockEleven.marketBirds;

public class Parrot implements Birds
{
    private String str;

    public Parrot(String str) {
        this.str = str;
    }

    public void sing()
    {
        System.out.println(str);
    }
}
