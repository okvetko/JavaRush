package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[21];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int length = array.length;
        if(length % 2 == 0) {
            Arrays.fill(array, 0, length/2, valueStart);
            Arrays.fill(array, length/2, length, valueEnd);
        }
        else {Arrays.fill(array, 0, (length/2 + 1), valueStart);
            Arrays.fill(array, (length/2 + 1), length, valueEnd);
        }

        System.out.println(Arrays.toString(array));
    }
}
