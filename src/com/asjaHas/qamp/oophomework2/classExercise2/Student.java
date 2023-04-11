package com.asjaHas.qamp.oophomework2.classExercise2;

public class Student {
    private final String name;
    private final int age;

    public Student(String name) {
        this.name = name;
        this.age = 15;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name: " + name + " Age: " + age;
    }
}
