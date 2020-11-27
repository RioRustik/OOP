package ru.kusiapkulov.blockEleven.main;


public class Cat implements Meow {
    String name;
    //  int n;
    final String s = "Мяу";

    public Cat(String name) {
        this.name = name;
    }

    public void myi() {
        System.out.println(this.name+s);
    }

    public void myi(int n) {
        String res = "Мяу ";
        if (n > 0){
            for (int i = 0; i < n - 1; i++) {
                res += this.s + " ";
            }
            System.out.println(this.name+res);
        }
        else System.out.println("NN");
    }

    public void meow()
    {
        System.out.println("Мяу");
    }
}
