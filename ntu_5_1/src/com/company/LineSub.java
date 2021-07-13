package com.company;

import java.nio.channels.Pipe;

public class LineSub extends Point{
    // A line needs two points: begin and end.
    // The begin point is inherited from its superclass Point.
    // Private variables
    Point end;               // Ending point

    //Constructors
    public LineSub (int beginX, int beginY, int endX, int endY){
        super(beginX,beginY);
        this.end = new Point(endX,endY);
    }

    public LineSub (Point begin, Point end){
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public Point getBegin(){
        Point tempPoint = new Point();
        tempPoint.setXY(super.getX(), super.getY());
        return tempPoint;
    }

    public void setBegin(Point begin){
        super.setXY(begin.getX(), begin.getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return super.getX();
    }

    public void setBeginX(int beginX) {
        super.setX(beginX);
    }

    public int getBeginY() {
        return super.getY();
    }

    public void setBeginY(int beginY) {
        super.setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {
        super.setXY(beginX, beginY);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int endX) {
        end.setX(endX);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int endY) {
        end.setY(endY);
    }

    public void setEndXY(int endX, int endY) {
        end.setXY(endX, endY);
    }

    public double getLength() {
        int xDiff = end.getX() - super.getX();
        int yDiff = end.getY() - super.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }


    public double getGradient() {
        int xDiff = end.getX() - super.getX();
        int yDiff = end.getY() - super.getY();
        return Math.atan2(yDiff, xDiff);
    }

    @Override
    public String toString() {
        return "LineSub{" +
                "begin=" +
                super.toString() +
                ", end=" + end +
                "} ";
    }
}
