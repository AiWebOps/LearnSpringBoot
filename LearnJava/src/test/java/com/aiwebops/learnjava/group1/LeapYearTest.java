package com.aiwebops.learnjava.group1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class LeapYearTest {

    @Test
    public void isLeapYearTest(){
        LeapYear ly = new LeapYear();
        assertTrue(ly.isLeapYear(2004));
    }

    @Test
    public void leapYearFilterTest(){
        LeapYear ly = new LeapYear();
        int[] numbers = {1988, 1989, 1992, 1994, 1996,1997, 2000,2004,2008,2010,2012,2014,2016,2018,2020,2024,2026,2028};
        Integer[] leapYears = {1988,1992,1996,2000,2004,2008,2012,2016,2020,2024,2028};
        assertTrue(Arrays.equals(leapYears, ly.leapYearFilter(numbers)));
    }
}
