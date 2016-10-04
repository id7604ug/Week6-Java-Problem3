package com.anthony;

import java.util.ArrayList;

public class ITECCourseManager {

    public static void main(String[] args) {
        ArrayList<ITECCourse> ITECList = new ArrayList<ITECCourse>();

        ITECCourse maintenance = new ITECCourse("Microcomputer System", 1425, 20, null);
        maintenance.setRoom("2020");
        maintenance.addStudent("Clara");
        maintenance.addStudent("Nick");
        maintenance.addStudent("John");
//        maintenance.writeCourseInfo();

        ITECList.add(maintenance);

        ITECCourse dataCom = new ITECCourse("Data Communication", 1475, 25, null);
        dataCom.addStudent("John");
        dataCom.addStudent("Billy");
//        dataCom.writeCourseInfo();

        ITECList.add(dataCom);

        ITECCourse javaProgramming = new ITECCourse("Java Programming", 2545, 24, "T3050");
//        javaProgramming.writeCourseInfo();

        ITECList.add(javaProgramming);

        javaProgramming.removeStudent("Gus");
        javaProgramming.removeStudent("Timmy");

        ITECCourse smallClass = new ITECCourse("Small Class", 1234, 3, null);
        smallClass.addStudent("student1");
        smallClass.addStudent("student2");
        smallClass.addStudent("student3");
        smallClass.addStudent("student4");
//        smallClass.writeCourseInfo();

        ITECList.add(smallClass);

        for (ITECCourse course:ITECList) {
            System.out.println(course.getName() + " has " + course.getNumberOfStudents() + " students");
        }


    }
}
