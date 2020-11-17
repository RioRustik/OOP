package ru.kusiapkulov.blockEleven.fraction;

import java.util.Objects;

public final class Fraction extends Number{
    private int numerator, denominator;

    Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator &&
                denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    public int intValue(){
        return 0;
    }
    public long longValue(){
        return 0;
    }
    public float floatValue(){
        return 0;
    }
    public double doubleValue(){
        return 0;
    }

    public String toString(){
        return this.numerator+"/"+this.denominator;
    }

    public Fraction sum(Fraction sum){
        if(this.denominator != sum.denominator){
            return (new Fraction(this.numerator * sum.denominator + this.denominator*sum.numerator,
                    this.denominator* sum.denominator));
        }
        else return (new Fraction(this.numerator+ sum.numerator, this.denominator));
    }
    public Fraction sum(int x){
        return this.sum(new Fraction(x,1));
    }

    public Fraction minus (Fraction minus){
        if(this.denominator != minus.denominator){
            return(new Fraction(this.numerator * minus.denominator - this.denominator*minus.numerator,
                    this.denominator* minus.denominator));
        }
        else return(new Fraction(this.numerator - minus.numerator, this.denominator));
    }
    public Fraction minus(int x){
        return this.minus(new Fraction(x,1));
    }

    public Fraction multiply (Fraction multiply){
        return (new Fraction(this.numerator * multiply.numerator,this.denominator * multiply.denominator));
    }
    public Fraction multiply(int x){
        return this.multiply(new Fraction(x,1));
    }

    public Fraction split (Fraction split){
        return (new Fraction(this.numerator * split.denominator,this.denominator * split.numerator));
    }
    public Fraction split(int x){
        return this.split(new Fraction(x,1));
    }



}
