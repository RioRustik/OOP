package ru.kusiapkulov.blockEleven.marketBirds;

public class Main
{
    public static void main(String [] args)
    {
        Sparrow sparrow = new Sparrow();
        Birds cuckoo = new Cuckoo();
        Birds parrot = new Parrot("Я так соскучился");
        test(sparrow, sparrow, cuckoo, parrot);
    }
    public static void test(Birds ...birds)
    {
        for(Birds i: birds)
            i.sing();
    }
}
