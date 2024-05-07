package com.javarush.task.pro.task05.task0510;

/* 
Треугольный массив
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
            int length = result[i].length;
            for (int j = 0; j < length; j++) {
                int value = i + j;
                result[i][j] = i + j;
                if(j + 1 < length) {
                    System.out.print(value + " ");
                } else {
                    System.out.println(value);
                }

            }

        }
    }
}
