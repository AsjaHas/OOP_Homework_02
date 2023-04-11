package com.asjaHas.qamp.oophomework2.classExercise2;

public class Main {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        Student student1 = new Student("Asja Hasanovic");
        Student student2 = new Student("Dzana Hasanovic", 18);

        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.printClassroom();
        System.out.println("Student " + student1.getName() + " is present in the classroom: " + classroom.isPresent("Asja Hasanovic"));
    }
}
