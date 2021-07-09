package com.company;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "MyComplex{" +
                real +
                "+" + imag + "i" +
                '}';
    }

    public boolean isReal() {
        return (imag == 0);
    }

    public boolean isImaginary() {
        return (imag != 0);
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex myComplex) {
        return (this.real == myComplex.real && this.imag == myComplex.imag);
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public MyComplex addInto (MyComplex right){
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right){
        return new MyComplex(right.real, right.imag);
    }

}
