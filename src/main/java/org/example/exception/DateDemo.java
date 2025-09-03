package org.example.exception;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
//        System.out.println("Date" + today);

        LocalDate bod = LocalDate.of(2005,9,02);
//        System.out.println(bod);
        LocalDate nextWeek = today.plusWeeks(1);
//        System.out.println(nextWeek);
        LocalDate prevWeek = today.minusWeeks(1);
//        System.out.println(prevWeek);
//        calculate the number of days for a president to finish his first tenure if it ends may 29th 2027
        LocalDate endOfTen = LocalDate.of(2027,6,27);
        System.out.println("Destined end of tenure: " + endOfTen);

        long days_left = ChronoUnit.DAYS.between(today, endOfTen);
        System.out.println("Days before first tenure : " + days_left);

        //write a program to shut down your pc in 5min
        //build a console application for attendance management system


//        int numOfDays = today.compareTo(endOfTen);
//        System.out.println("Number of years :" + numOfDays);
    }

}
