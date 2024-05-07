package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean a = false;
        int sum = 0;
        while (!a)
                {
            if (console.hasNextInt()) {
                int b = console.nextInt();
                sum += b;
            } else {
               String c = console.nextLine();
                a = c.equals("ENTER");

            }
        } System.out.println(sum);
    }
}