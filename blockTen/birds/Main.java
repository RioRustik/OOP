package ru.kusiapkulov.blockTen.birds;

public class Main
{
    public static void main(String [] args)
    {
        Sparrow sparrow = new Sparrow();
        sparrow.sing();
        Cuckoo cuckoo = new Cuckoo();
        cuckoo.sing();
        Parrot parrot = new Parrot("Я так соскучился");
        parrot.sing();
    }
}
