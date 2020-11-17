package ru.kusiapkulov.blockEleven.meow;

public class Lab {

    public static void main(String[] args) {
        Cat barsic = new Cat("Барсик ");
        Cat ippolit = new Cat("Ипполит ");
        Dog sharlotta = new Dog();
        test(barsic, ippolit, sharlotta);
    }

    public static void test(Meow ...animal)
    {
        for(Meow i: animal)
        {
            i.meow();
        }
    }
}
