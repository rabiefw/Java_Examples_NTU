package com.company;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
        this.hour = 0;
        this.minute = 0;
        this.minute = 0;
    }

    public MyTime(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("ERROR: Value Hour not between 0 & 24");
        }
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("ERROR: Value Minute not between 0 & 59");
        }
        if (second >= 0 && second < 24) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("ERROR: Value Second not between 0 & 60");
        }
    }

    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("ERROR: Value Hour not between 0 & 24");
        }
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("ERROR: Value Minute not between 0 & 59");
        }
        if (second >= 0 && second < 24) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("ERROR: Value Second not between 0 & 60");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("ERROR: Value Hour not between 0 & 24");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("ERROR: Value Minute not between 0 & 59");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 24) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("ERROR: Value Second not between 0 & 60");
        }
    }

    @Override
    public String toString() {
/*        String zeroHour, zeroMinute, zeroSecond;
        if (hour < 10) {
            zeroHour = "0";
        } else {
            zeroHour = "";
        }

        if (minute < 10) {
            zeroMinute = "0";
        } else {
            zeroMinute = "";
        }

        if (second < 10) {
            zeroSecond = "0";
        } else {
            zeroSecond = "";
        }

        return "MyTime{" + zeroHour +
                 hour +
                ":" + zeroMinute+ minute +
                ":" + zeroSecond + second +
                '}';
        */


        return String.format("%1$02d:%2$02d:%3$02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
        }
        if (minute >= 60) {
            minute = 0;
            hour++;
        }
        if (hour >= 24) {
            hour = 0;
        }
        return this;
    }

    public MyTime nextMinute() {
        minute++;
        if (minute >= 60) {
            minute = 0;
            hour++;
        }
        if (hour >= 24) {
            hour = 0;
        }
        return this;
    }

    public MyTime nextHour() {
        hour++;
        if (hour >= 24) {
            hour = 0;
        }
        return this;
    }

}
