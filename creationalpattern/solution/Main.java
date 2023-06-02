package com.creationalpattern.solution;

public class Main {

    public static void main(String[] args) {
        Student student = new Student(24, 1234, "xyz");
        Student cloneStudent = (Student) student.clone();

        System.out.println(student.toString());
        System.out.println(cloneStudent.toString());
    }
}
