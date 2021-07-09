package com.company;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            sb.append(coeffs[i] + (i != 0 ? "*x^" + i + " + " : ""));
        }
        return sb.toString();
    }

    /**
     * A method evaluate(double x) that evaluate the polynomial for the given x,
     * by substituting the given x into the polynomial expression.
     */
    public double evaluate(double x) {
        double evaluated = 0.0;
        for (int i = coeffs.length - 1; i >= 0; i--) {
            evaluated += (coeffs[i] * Math.pow(x, i));
        }
        return evaluated;
    }

    //public double evaluate(double x)
    //{
    //    double sum  = 0.0;
    //    double item = 1.0;
    //    for (int i = 0; i < coeffs.length; i++) {
    //        item *= (i == 0 ? 1.0 : x);
    //        sum  += item * coeffs[i] ;
    //    }
    //    return sum;
    //}

    /**
     *Methods add() and multiply() that
     *adds and multiplies this polynomial with the given MyPolynomial instance another,
     *and returns this instance that contains the result.
     */

    


}
