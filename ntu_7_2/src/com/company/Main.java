package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Test Point Class
        Point point1 = new Point(3,4);
        Point point2 = new Point(6 , 8);

        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point1.distance(point2));

        // Test default constructor and toString()
        PolyLine l1 = new PolyLine();
        System.out.println(l1);  // {}

        // Test appendPoint()
        l1.appendPoint(new Point(0, 0));
        l1.appendPoint(3, 4);
        l1.appendPoint(6, 8);
        System.out.println(l1);  // {(1,2)(3,4)(5,6)}
        System.out.println(l1.getLength());

        // Test constructor 2
        List<Point> points = new ArrayList<Point>();
        points.add(new Point(11, 12));
        points.add(new Point(13, 14));
        PolyLine l2 = new PolyLine(points);
        System.out.println(l2);  // {(11,12)(13,14)}


    }

}
