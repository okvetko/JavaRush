package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = null;
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber <= 0) {
        return "";}
        String result = "";
            while (decimalNumber != 0) {
            result = (decimalNumber % 2) + result;
            decimalNumber = decimalNumber/2;
             }
        return result;

    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.equals("") ) {
            return 0;}
        int result = 0;
        char[] characters = binaryNumber.toCharArray();
        int left = 0;
        int right = characters.length - 1;
        while (left < right){
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < binaryNumber.length(); i++) {
            result = result + (characters[i] - '0') * (int) Math.pow(2, i);
        }
        return result;
    }
}
