package com.company;

import static java.lang.Integer.valueOf;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        String zeroDay, zeroMonth;
        if (day < 10) {
            zeroDay = "0";
        } else {
            zeroDay = "";
        }
        if (month < 10) {
            zeroMonth = "0";
        } else {
            zeroMonth = "";
        }

        return "Date{" +
                "day=" + zeroDay + day +
                ", month=" + zeroMonth + month +
                ", year=" + year +
                '}';
    }
}
