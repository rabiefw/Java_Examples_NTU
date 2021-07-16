package com.company;

/**
 * *** Warning ***
 * In order to build this you need to configure this file as the main build
 */

/* Enum with abstract method */
enum Day {
    MONDAY(1) {
        public Day next() { return TUESDAY; }   // each instance provides its implementation to abstract method
    },
    TUESDAY(2) {
        public Day next() { return WEDNESDAY; }
    },
    WEDNESDAY(3) {
        public Day next() { return THURSDAY; }
    },
    THURSDAY(4) {
        public Day next() { return FRIDAY; }
    },
    FRIDAY(5) {
        public Day next() { return SATURDAY; }
    },
    SATURDAY(6) {
        public Day next() { return SUNDAY; }
    },
    SUNDAY(7) {
        public Day next() { return MONDAY; }
    };

    public abstract Day next();

    private final int dayNumber;

    Day(int dayNumber) {   // constructor
        this.dayNumber = dayNumber;
    }

    int getDayNumber() {
        return dayNumber;
    }
}

public class DayTestEnum {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.printf("%s (%d), next is %s\n", day, day.getDayNumber(), day.next());
        }
    }
}
