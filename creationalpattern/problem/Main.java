package com.creationalpattern.problem;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(24, 1234, "xyz");
        Student cloneStudent = new Student();

        cloneStudent.name = student.name;
        cloneStudent.age = student.age;
        // member field or getter can be private, so can't be cloned in this way
        //cloneStudent.rollNumber = student.rollNumber;


    }
}
