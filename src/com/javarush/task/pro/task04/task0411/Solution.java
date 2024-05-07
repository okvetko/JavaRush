package com.javarush.task.pro.task04.task0411;

/* 
Четные числа
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; (i <= 20) ; i++ )
        { if (i % 7 == 0) continue;
        {System.out.println(i);}}


    }
}