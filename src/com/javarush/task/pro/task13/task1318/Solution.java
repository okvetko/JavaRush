package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        int index = month.ordinal();
        Month nextMonth;
        if(index < 11){
        nextMonth = Month.values()[index + 1];}
        else {
            nextMonth = Month.values()[0];
        }
        return nextMonth;
    }
}
