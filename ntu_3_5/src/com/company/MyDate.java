package com.company;

public class MyDate {
    private static final int MIN_YEAR = 1;
    private static final int MAX_YEAR = 9999;

    private static final int MIN_MONTH = 1;
    private static final int MAX_MONTH = 12;

    public static final String[] MONTHS = {
            "Jan", "Feb", "Mar",
            "Apr", "May", "Jun",
            "Jul", "Aug", "Sep",
            "Oct", "Nov", "Dec"
    };

    public static final String[] DAYS = {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
    };

    public static final int[] DAYS_IN_MONTH = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    private static final int[] CENTURY_NUMBER_TABLE = {6, 4, 2, 0};
    private static final int[] NON_LEAP_MONTH_ADDER = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    private static final int[] LEAP_MONTH_ADDER = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

    private int year;
    private int month;
    private int day;

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static int getMonthLastDay(int year, int month) {
        return DAYS_IN_MONTH[month - 1] + (isLeapYear(year) && month == 2 ? 1 : 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        /* TODO: add leap year check */
        return (MIN_YEAR  <= year   && year  <= MAX_YEAR)
                && (MIN_MONTH <= month  && month <= MAX_MONTH)
                && (1         <= day    && day   <= getMonthLastDay(year, month));
    }

    public static int getDayOfWeek(int year, int month, int day) {
        /* TODO: implement */
        if (!isValidDate(year, month, day)) {
            return -1;
        }

        int yearFirstTwoDigits = Integer.parseInt(("" + year).substring(0, 2)); //first two digit of the year
        int monthTableNumber = isLeapYear(year) ? LEAP_MONTH_ADDER[month - 1] : NON_LEAP_MONTH_ADDER[month - 1];
        int lastTwoDigitsOfYear = year % 100;

        return (CENTURY_NUMBER_TABLE[yearFirstTwoDigits % 4] + lastTwoDigitsOfYear
                + lastTwoDigitsOfYear / 4 + monthTableNumber + day) % 7;
    }

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (isValidDate(year, this.month, this.day)) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid Year!");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (isValidDate(this.year, month, this.day)) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid month!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (isValidDate(this.year, this.month, day)) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid day!");
        }
    }

    @Override
    public String toString() {
        return "MyDate{" +
                DAYS[getDayOfWeek(year, month, day)] + " " +
                day + " " +
                MONTHS[month - 1] + " " +
                year +
                '}';
    }

    public MyDate nextDay() {
        int maxDay = getMonthLastDay(year, month);
        if (maxDay == day && MAX_MONTH == month && MAX_YEAR == year) {
            return this;
        }

        if (maxDay == day && MAX_MONTH == month) {
            setDate(year + 1, MIN_MONTH, 1);
            return this;
        }

        if (maxDay == day) {
            setDate(year, month + 1, 1);
            return this;
        }

        setDate(year, month, day + 1);
        return this;
    }

    public MyDate nextMonth() {
        if (MAX_MONTH == month && MAX_YEAR == year) {
            return this;
        }

        int maxDay = (MAX_MONTH == month)
                ? getMonthLastDay(year + 1, MIN_MONTH)
                : getMonthLastDay(year, month + 1);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        } else if (day > maxDay) {
            maxDay = maxDay;
        } else if (day < maxDay) {
            maxDay = day;
        }

        if (MAX_MONTH == month) {
            setDate(year + 1, MIN_MONTH, maxDay);
            return this;
        }

        setDate(year, month + 1, maxDay);
        return this;
    }

    public MyDate nextYear() {
        if (MAX_YEAR == year) {
            return this;
        }

        int maxDay = getMonthLastDay(year + 1, month);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        } else if (day > maxDay) {
            maxDay = maxDay;
        } else if (day < maxDay) {
            maxDay = day;
        }

        setDate(year + 1, month, maxDay);
        return this;
    }

    public MyDate previousDay() {
        if (1 == day && MIN_MONTH == month && MIN_YEAR == year) {
            return this;
        }

        if (1 == day && MIN_MONTH == month) {
            setDate(year - 1, MAX_MONTH, getMonthLastDay(year - 1, MAX_MONTH));
            return this;
        }

        if (1 == day) {
            setDate(year, month - 1, getMonthLastDay(year, month - 1));
            return this;
        }

        setDate(year, month, --day);
        return this;
    }

    public MyDate previousMonth() {
        if (MIN_MONTH == month && MIN_YEAR == year) {
            return this;
        }

        int maxDay = (MIN_MONTH == month)
                ? getMonthLastDay(year - 1, MAX_MONTH)
                : getMonthLastDay(year, month - 1);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        } else if (day > maxDay) {
            maxDay = maxDay;
        } else if (day < maxDay) {
            maxDay = day;
        }

        if (MIN_MONTH == month) {
            setDate(year - 1, MAX_MONTH, maxDay);
            return this;
        }

        setDate(year, month - 1, maxDay);
        return this;
    }

    public MyDate previousYear() {
        if (MIN_YEAR == year) {
            return this;
        }

        int maxDay = getMonthLastDay(year - 1, month);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        } else if (day > maxDay) {
            maxDay = maxDay;
        } else if (day < maxDay) {
            maxDay = day;
        }

        setDate(year - 1, month, maxDay);
        return this;
    }
}
