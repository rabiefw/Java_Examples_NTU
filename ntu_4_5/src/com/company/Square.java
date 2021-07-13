package com.company;

public class Square extends Rectangle{
    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(color, filled, side, side);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side){
        super.setHeight(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public String
    toString() {
        return "Square{} " + super.toString();
    }
}
