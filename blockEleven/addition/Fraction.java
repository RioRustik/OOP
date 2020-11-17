package ru.kusiapkulov.blockEleven.addition;

public final class Fraction extends Number{
    private float numerator, denominator;

    Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int intValue(){
        return (int)(this.numerator/this.denominator);
    }
    public long longValue(){
        return (int)(this.numerator/this.denominator);
    }
    public float floatValue(){
        return this.numerator/this.denominator;
    }
    public double doubleValue(){
        return this.numerator/this.denominator;
    }

    public String toString(){
        return this.numerator+"/"+this.denominator;
    }

//    public Fraction sum(Fraction sum){
//        if(this.denominator != sum.denominator){
//            return (new Fraction(this.numerator * sum.denominator + this.denominator*sum.numerator,
//                    this.denominator* sum.denominator));
//        }
//        else return (new Fraction(this.numerator+ sum.numerator, this.denominator));
//    }
//    public Fraction sum(int x){
//        return this.sum(new Fraction(x,1));
//    }
//
//    public Fraction minus (Fraction minus){
//        if(this.denominator != minus.denominator){
//            return(new Fraction(this.numerator * minus.denominator - this.denominator*minus.numerator,
//                    this.denominator* minus.denominator));
//        }
//        else return(new Fraction(this.numerator - minus.numerator, this.denominator));
//    }
//    public Fraction minus(int x){
//        return this.minus(new Fraction(x,1));
//    }
//
//    public Fraction multiply (Fraction multiply){
//        return (new Fraction(this.numerator * multiply.numerator,this.denominator * multiply.denominator));
//    }
//    public Fraction multiply(int x){
//        return this.multiply(new Fraction(x,1));
//    }
//    public Fraction split (Fraction split){
//        return (new Fraction(this.numerator * split.denominator,this.denominator * split.numerator));
//    }
//    public Fraction split(int x){
//        return this.split(new Fraction(x,1));
//    }
//


}
