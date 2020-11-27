package ru.kusiapkulov.fractions.blockTwelve.sum;

import ru.kusiapkulov.blockEleven.main.Fraction;

import static ru.kusiapkulov.blockEleven.Main.sum;

import java.math.BigDecimal;

public class Sum
{
    public  static  void main(String [] args)
    {
        BigDecimal a = new BigDecimal("12345678912345678912");
        System.out.println(a);
        double b = a.doubleValue();
        System.out.println(sum(new Integer(7), new Fraction(11, 3), new Double(3.21), new Double(b)));
    }
}
