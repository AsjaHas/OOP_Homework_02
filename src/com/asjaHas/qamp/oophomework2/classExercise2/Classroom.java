package com.asjaHas.qamp.oophomework2.classExercise2;

import java.util.ArrayList;

public class Classroom {
    private final ArrayList<Student> students;
    public Classroom(){
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public boolean isPresent(String name){
        for (Student student : students) {
            if (student.getName().equals(name)){
                return true;
            }
        }
        return false; //boolean method false by default
    }
    public void printClassroom(){
        System.out.println("Classroom: ");
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}

