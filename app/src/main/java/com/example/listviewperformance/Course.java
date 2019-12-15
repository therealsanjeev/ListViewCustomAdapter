package com.example.listviewperformance;

import java.util.ArrayList;
import java.util.Random;

public class Course {
    String name;
    String teachername;
    int lecture;

    public String getName() {
        return name;
    }

    public String getTeachername() {
        return teachername;
    }
    public int getLecture() {
        return lecture;
    }
    public static final String[] teachers = {
            "Sanjeev", "Sunil", "Dileep", "Ravi", "Abhishek", "Kunal"
    };
    public static final String[] courseName = {
            "Android","C++","Java", "JS", "Python","Web Dev"
    };


    public Course(String name, String teachername, int lecture) {
        this.name = name;
        this.teachername = teachername;
        this.lecture = lecture;
    }
    public static ArrayList<Course> generateNRandomCourses(int n){

        ArrayList<Course> courses = new ArrayList<>();
        Random r= new Random();
        for(int i=0;i<n;i++){
            Course course = new Course(
                    teachers[r.nextInt(6)],
                    courseName[r.nextInt(6)],
                    10+r.nextInt(10)
            );
            courses.add(course);
        }

        return courses;
    }
}
