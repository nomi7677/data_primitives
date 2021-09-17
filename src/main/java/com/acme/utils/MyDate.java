package com.acme.utils;

public class MyDate {
    int month;
    int day;
    public int year;

    public MyDate(){}

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}
