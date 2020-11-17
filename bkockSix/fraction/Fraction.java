package ru.kusiapkulov.bkockSix.fraction;

public class Fraction {
    private final int numerator, denominator;

    Fraction(int numerator, int denominator){
//        if(denominator < 0)throw new IllegalArgumentException(denominator+"");

        if(numerator < 0){
            this.denominator = denominator*(-1);
            this.numerator = numerator;
        }
        else{
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    public String toString(){
        return this.numerator+"/"+this.denominator;
    }

    public Fraction sum(Fraction sum){
        if(this.denominator != sum.denominator){
            return (new Fraction(this.numerator * sum.denominator + this.denominator*sum.numerator,
                    this.denominator* sum.denominator));
        }
        else return (new Fraction(this.numerator + sum.numerator, this.denominator));
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
