package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

public class Solution {
    public static void main(String[] args) {
       Outer object = new Outer();
       Outer.Inner object3 = object.new Inner();
        Outer.Nested object2 = new Outer.Nested();
    }
}
