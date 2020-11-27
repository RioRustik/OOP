package ru.kusiapkulov.fractions.blockTwelve.transformation;

import static java.lang.Double.parseDouble;
import static java.lang.Math.pow;

public class PowAndPars
{
    public static void main(String [] arr)
    {
        String [] args = new String[]{"3","2"};
        transformation(args);
    }
    public static void transformation(String [] args)
    {
        if(args.length != 2) throw new IllegalArgumentException();
        double z, x, y;
        x = parseDouble(args[0]);
        y = parseDouble(args[1]);
        z = pow(x, y);
        System.out.println(z);
    }
}
