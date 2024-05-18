package com.javarush.task.pro.task07.task0710;

/* 
Массив значений
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        int value =100;
        for (int i = 0; i < array.length; i++)
            array[i] = value;
        System.out.println(Arrays.toString(array));
    }


    }

