package ru.kusiapkulov.blockEleven.fraction;

public class Lab {

    public static void main(String [] args){
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 2);
        Boolean hash = a.hashCode() == b.hashCode();
        System.out.println(hash);
        System.out.println(a.equals(b));
        Boolean links = a == b;
        System.out.println(links);
    }
}
