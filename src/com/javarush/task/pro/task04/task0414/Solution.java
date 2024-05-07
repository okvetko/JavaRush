package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String t = console.nextLine();
        int n = console.nextInt();
        int i = 0;
        do {
            System.out.println(t);
            i++;
        } while (i < n);
    }
}