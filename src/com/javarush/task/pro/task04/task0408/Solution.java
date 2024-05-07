package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min = Integer.MIN_VALUE;
        int print = 0;
        int max = Integer.MAX_VALUE;


        while (console.hasNextInt())
        {
            int x = console.nextInt();
            {if ((x > min) && (x % 2 == 0))
            min = x;}


        }
        System.out.println(min);







    }
}