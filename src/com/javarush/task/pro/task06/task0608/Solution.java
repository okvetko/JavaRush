package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
Scanner console = new Scanner(System.in);
long a = console.nextLong();

        System.out.println(cube(a));
    }

public static long cube(long result) {


    result = result * result * result;

    return result;
}
}
