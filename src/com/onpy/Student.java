package com.onpy;

public class Student {
    String surname;
    public int year_birthday = 2003;
    public int group = 1;
    public int exam_physics = 0;
    public int exam_maths = 0;
    public int exam_history = 0;

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", year_birthday=" + year_birthday +
                ", group=" + group +
                ", exam_physics=" + exam_physics +
                ", exam_maths=" + exam_maths +
                ", exam_history=" + exam_history +
                '}';
    }

    public Student(String surname, int year_birthday, int group, int exam_physics, int exam_maths, int exam_history) {
        this.surname = surname;
        this.year_birthday = year_birthday;
        this.group = group;
        this.exam_physics = exam_physics;
        this.exam_maths = exam_maths;
        this.exam_history = exam_history;
    }
}