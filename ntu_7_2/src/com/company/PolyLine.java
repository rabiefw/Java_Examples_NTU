package com.company;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> points;

    // Constructors
    public PolyLine() {  // default constructor
        points = new ArrayList<Point>();  // implement with ArrayList
    }

    public PolyLine(List<Point> points) {
        this.points = points;
    }

    public void appendPoint(int x, int y) {
        Point newPoint = new Point(x, y);
        points.add(newPoint);
    }

    public void appendPoint(Point point) {
        points.add(point);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (Point aPoint : points) {
            stringBuilder.append(aPoint.toString());
        }

        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public double getLength() {
        double totalLength = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            totalLength += points.get(i).distance(points.get(i + 1));
        }

        return totalLength;
    }

}
