package com.aiwebops.learnjava.group1;

/*
* Author: Shuaishuai Li
* */

import java.util.ArrayList;

public class LeapYear {

    public Integer[] leapYearFilter(int[] numbers){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int v: numbers){
            if (isLeapYear(v) == true){
                ans.add(v);
            }
        }
        return ans.toArray(new Integer[ans.size()]);
    }

    Boolean isLeapYear(int year){
/*        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }else {
            return false;
        }*/
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)? true: false;
    }

}
