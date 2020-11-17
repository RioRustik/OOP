package ru.kusiapkulov.blockEleven.addition;

public class Main {
    public static void main(String [] args)
    {
        System.out.println(sum(new Integer(3), new Fraction(3, 5), new Double(2.3)));
        System.out.println(sum(new Double(3.6), new Fraction(49, 12),new Integer(3), new Fraction(3, 2)));

    }
    public static float sum(Number ...arr)
    {
        float res = 0;
        for(Number i:arr)
            res += i.floatValue();
        return res;
    }
}
