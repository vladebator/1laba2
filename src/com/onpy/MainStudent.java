/*
Лисовой Владислав (АТ-201)
Вариант по списку: №13.
Лабораторная работа №1 (Базовый уровень).
Постановка задачи: Напечатать фамилии студентов, которые
сдали математику на «отлично» и определить их количество.
*/

package com.onpy;

public class MainStudent {

    public static final int EXCELLENT = 90;

    public static void main(String[] args) {
        int counter_excellent_student = 0;

        Student Ivanov = new Student("Ivanov", 2003, 1, 70, 75, 90);
        System.out.println(Ivanov);
        if(Ivanov.exam_maths >= EXCELLENT)
        {
            System.out.println("This student has passed math with - Excellent" + "\n");
            counter_excellent_student = counter_excellent_student + 1;
        }

        Student Petrov = new Student("Petrov", 2003, 1, 80,85, 100);
        System.out.println(Petrov);
        if(Petrov.exam_maths >= EXCELLENT)
        {
            System.out.println("This student has passed math with - Excellent");
            counter_excellent_student = counter_excellent_student + 1;
        }
        if(counter_excellent_student > 0)
        {
            System.out.println("The number of students who passed math with excellent marks = " + counter_excellent_student);
        }
        else
        {
            System.out.println("No excellent students in mathematics");
        }
    }
}

