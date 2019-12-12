package com.example.listviewcustomadapter;

import java.util.ArrayList;

public class Teacher {

    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public static ArrayList<Teacher>  get10RandomTeachers(){
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Sanjeev","Android"));
        teachers.add(new Teacher("Sunil","C++"));
        teachers.add(new Teacher("Dileep","Java"));
        teachers.add(new Teacher("Ravi","Chemistry"));


        return teachers;
    }
    String name;
    String course;



}
