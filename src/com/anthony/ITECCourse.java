package com.anthony;


import java.util.ArrayList;

public class ITECCourse {
    private String name;
    private int code;
    private ArrayList<String> students;
    private int maxStudents;
    private String room;

    // Constructor
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents, String room){
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    // Method to add student to ArrayList
    public void addStudent(String studentName){
        if(students.size() == maxStudents){
            System.out.println("Sorry, course is full, can't enroll: " + studentName);
        } else {
            students.add(studentName);
        }
    }
    // Method to display information for the course
    public void writeCourseInfo(){
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Course Room: " + room);
        System.out.println("Students enrolled: ");
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students for this course is " + maxStudents);
        System.out.println();
    }
    // Method to get the total number of students
    public int getNumberOfStudents(){
        return this.students.size();
    }
    // Method to
    public void removeStudent(String name){
        if (students.contains(name)) {
            students.remove(name);
            System.out.println("Student " + name + " has been removed.");
        } else {
            System.out.println("Student " + name + " is not enrolled.");
        }
    }
}
