package com.dou.java.feature;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by dou on 2017/12/27.
 */
public class DateTime {

    public void today() {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.getYear());
        System.out.println(today.getMonth().getValue());
        System.out.println(today.getDayOfMonth());
    }

    public void formatter() {
        LocalDate newYear = LocalDate.of(2018,1,1);
        System.out.println(newYear);
        LocalDate nextYear = LocalDate.parse("2019-01-02");
        System.out.println(nextYear);
        nextYear = LocalDate.parse("2019/01/02", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(nextYear);
    }

    public void point() {
        LocalDate today = LocalDate.now();
        System.out.println(today.withDayOfMonth(1));
        System.out.println(today.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println(today.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
        System.out.println(today.with(TemporalAdjusters.previous(DayOfWeek.MONDAY)));
    }


    public static void main(String[] args) {
        DateTime dateTime = new DateTime();
        dateTime.today();
        dateTime.formatter();
        dateTime.point();
    }

}
