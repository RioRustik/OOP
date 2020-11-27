package ru.kusiapkulov.blockEleven.main;

public class Cuckoo implements Birds
{
    private int a = 0;
    private int b = 10;
    private String str = "";


    public void sing()
    {
        int random = a + (int) (Math.random() * b);
        for (int i = 0; i<random; i++)
        {
            str += "ку-ку ";
        }
        System.out.println(str);
    }

}
