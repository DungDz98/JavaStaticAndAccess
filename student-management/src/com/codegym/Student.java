package com.codegym;

public class Student {
    private String name = "John";
    private String classes = "C04";
    Student() {

    }
    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String toString() {
        return "Student{name: " + this.name + ", classes: " + this.classes + "}";
    }
}
