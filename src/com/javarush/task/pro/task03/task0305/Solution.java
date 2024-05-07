package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number1 = console.nextInt();
        int number2 = console.nextInt();
        int number3 = console.nextInt();
        boolean a = (number1 == number2);
        boolean b = (number2 == number3);
        boolean c = (number1 == number3);
        boolean d = (number1 == number2 && number2 == number3);
        if (d)
            System.out.println("" + number1 + " " + "" + number2 + " " + "" + number3);
        else if (b)
            System.out.println("" + number2 + " " + "" + number3);
        else if (c)
            System.out.println("" + number1 + " " + "" + number3);
        else if (a)
            System.out.println("" + number1 + " " + "" + number2);



    }
}
