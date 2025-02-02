package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Ваня", 10.0);
        grades.put("Оля", 8.8);
        grades.put("Jane", 8.7);
        grades.put("Jack", 8.8);
        grades.put("Li", 4.4);
    }
}
