package Item10;

import Item10.Point.Color;
import Item10.Point.ColorPoint;
import Item10.Point.Point;

public class Main {
    public static void main(String[] args) {
        //대칭성 위배
        CaseInsensitiveString cis=new CaseInsensitiveString("Polish");
        String s="polish";

        System.out.println(cis.equals(s));
        System.out.println(s.equals(cis));

        System.out.println("--------------------------------------------------------------");

        //대칭성 위배
        Point point=new Point(1, 1);
        ColorPoint colorPoint=new ColorPoint(1, 1, Color.BLUE);

        System.out.println(point.equals(colorPoint));
        System.out.println(colorPoint.equals(point));

        System.out.println("--------------------------------------------------------------");

        // 추이성 위배
        ColorPoint colorPoint1=new ColorPoint(1, 2, Color.BLUE);
        Point point1=new Point(1, 2);
        ColorPoint colorPoint2=new ColorPoint(1, 2, Color.RED);

        System.out.println(colorPoint1.equals(point1));
        System.out.println(point1.equals(colorPoint2));
        System.out.println(colorPoint1.equals(colorPoint2));
    }
}
