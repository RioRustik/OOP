package ru.kusiapkulov.blockEleven.lineLegth;


import ru.kusiapkulov.blockEleven.lineLegth.brokenLine.LineBroke;
import ru.kusiapkulov.blockEleven.lineLegth.brokenLine.PointBroke;
import ru.kusiapkulov.blockEleven.lineLegth.line.Line;
import ru.kusiapkulov.blockEleven.lineLegth.line.Point;

public class Main {
    public static void main(String [] args)
    {
        PointBroke b = new PointBroke(2,8);
        PointBroke c = new PointBroke(5,3);
        LineBroke l =  new LineBroke(new PointBroke(1,5), b, c);
        System.out.println(l);

        Point p1 = new Point(1,1);
        Point p2 = new Point(10,15);
        Line l1 = new Line(p1,p2);
        System.out.println(l1);

        System.out.println(sum(l, l1));
    }

    public static int sum(TotalLength ...arr)
    {
        int res = 0;
        for(TotalLength i:arr)
            res += i.length();
        return res;
    }
}
