package ru.kusiapkulov.blockEleven;

import ru.kusiapkulov.blockEleven.all.*;

import java.util.Arrays;

public class Main {
    public static void main(String [] args)
    {
        //11.1 Сложение
//        System.out.println(sum(new Integer(3), new Fraction(3, 5), new Double(2.3)));
//        System.out.println(sum(new Double(3.6), new Fraction(49, 12),new Integer(3), new Fraction(3, 2)));

        //11.13 Сравнение ломаных линий
//        Point b = new Point(2,8);
//        Point c = new Point(5,3);
//        LineBroke l =  new LineBroke(new Point(1,5), b, c);
//        System.out.println(l);
//        l.length1();
//        LineBroke l2 = new LineBroke(new Point(1,5), b, c);
//        System.out.println(l2);
//        l2.length1();
//        System.out.println(l.equals(l2));

        //11.7 Ломай меня полностью
//        Point p = new Point(3,2);
//        Point p1 = new Point(5,7);
//        Point p2 = new Point(12,16);
//        Rectangle rectangle = new Rectangle(p, 5, 3);
//        Square square = new Square(p, 5,5);
//        LineBroke l = new LineBroke(p,p1);
//        Triangle triangle = new Triangle(p2, new Point(5,6), new Point(2,5));
//        test(rectangle, l, square, l, triangle);

        //11.10 Сравнение дробей
//        Fraction a = new Fraction(1, 2);
//        Fraction b = new Fraction(1, 2);
//        Boolean hash = a.hashCode() == b.hashCode();
//        System.out.println(hash);
//        System.out.println(a.equals(b));
//        Boolean links = a == b;
//        System.out.println(links);

        //11.12 Сравнение линий
//        Point p1 = new Point(1,1);
//        Point p2 = new Point(10,15);
////        Line l = new Line(1,1,4,15);
////        Line l2 = new Line(1,1,4,15);
//        Line l = new Line(p1, p2);
//        Line l2 = new Line(p1,p2);
//        System.out.println(l);
//        System.out.println(l2);
//        System.out.println(l.equals(l2));

        //11.3 Общая площадь
//        Point p = new Point(3,2);
//        Circle circle = new Circle(p, 5);
//        System.out.println(circle.getArea());
//        Point p3 = new Point(3,2);
//        Rectangle rectangle = new Rectangle(p3, 5, 3);
//        System.out.println(rectangle.getArea());
//        Point p4 = new Point(3,2);
//        Square square = new Square(p4, 5,5);
//        System.out.println(square.getArea());
//        System.out.println(test(circle, rectangle, square ));

        //11.11 Сравнение точек
//        Dot point = new Dot(5);
//        Dot point1 = new Dot(2, 4);
//        Dot point3 = new Dot(2, 4);
//        Dot point2 = new Dot(7,9,8);
//        System.out.println(point3.equals(point1));
//        Boolean hash = point1.hashCode() == point3.hashCode();
//        System.out.println(hash);
//        System.out.println(point);
//        System.out.println(point1);
//        System.out.println(point2);

        //11.4 Мяуканье
//        Cat barsic = new Cat("Барсик ");
//        Cat ippolit = new Cat("Ипполит ");
//        Dog sharlotta = new Dog();
//        test(barsic, ippolit, sharlotta);

        //11.8 Лучший стрелок
//        Gunner gunner1 = new Gunner("Rustam");
//        Gunner gunner2 = new Gunner("Ippolit");
//        Gunner gunner3 = new Gunner("Dora");
//        MachineGun g1 = new MachineGun();
//        gunner2.setWeapon(new Gun(7,7));
//        gunner3.setWeapon(g1);
//        gunner1.shoot();
//        gunner2.shoot();gunner2.shoot();gunner2.shoot();
//        gunner3.shoot();

        //11.2 Птичий рынок
//        Sparrow sparrow = new Sparrow();
//        Birds cuckoo = new Cuckoo();
//        Birds parrot = new Parrot("Я так соскучился");
//        test(sparrow, sparrow, cuckoo, parrot);

        //11.5 Измерение длины.
//        Point b = new Point(2,8);
//        Point c = new Point(5,3);
//        LineBroke l =  new LineBroke(new Point(1,5), b, c);
//        System.out.println(l);
//        Point p1 = new Point(1,1);
//        Point p2 = new Point(10,15);
//        Line l1 = new Line(p1,p2);
//        System.out.println(l1);
//        System.out.println(sum(l, l1));

    }
    //11.5 Измерение длины.
    public static int sum(TotalLength...arr)
    {
        int res = 0;
        for(TotalLength i:arr)
            res += i.length();
        return res;
    }

    //11.2 Птичий рынок
    public static void test(Birds...birds)
    {
        for(Birds i: birds)
            i.sing();
    }

    //11.4 Мяуканье
    public static void test(Meow...animal)
    {
        for(Meow i: animal)
        {
            i.meow();
        }
    }

    //сложение
    public static float sum(Number ...arr)
    {
        float res = 0;
        for(Number i:arr)
            res += i.floatValue();
        return res;
    }

    //11.7 Ломай меня полностью
    public static void test(Test...figures)
    {
        LineBroke[] all = new LineBroke[3];
        int n=0;
        for(Test i : figures)
        {
            all[n] = i.getPolygonalChain();
            if(n < all.length)
                n++;
            if(n == all.length)
                all = Arrays.copyOf(all, all.length+1);
        }
        System.out.println(Arrays.toString(all));
    }

    //11.3 Общая площадь
    public static double test(Area...figures)
    {
        double allArea = 0;
        for(Area i: figures){
            allArea += i.getArea();
        }
        return allArea;
    }
}
