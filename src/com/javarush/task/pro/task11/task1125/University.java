package com.javarush.task.pro.task11.task1125;

/* 
Составляем список студентов
*/

public class University {
    private final String[] students = new String[30];

    public void addStudent(String student) {
        int i = 0;
        for (; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
        }
        students[i] = student;
    }

    public void printStudents() {
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        University stud = new University();
        stud.addStudent("Максим Федоренко");
        stud.addStudent("Олег Кесарчук");
        stud.printStudents();
    }
}
