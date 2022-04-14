package com.mandiri.dto;

public class Course {

    private String courseName;
    private Integer courseDurationInHour;

    public Course(String courseName, Integer courseDurationInHour) {
        this.courseName = courseName;
        this.courseDurationInHour = courseDurationInHour;
    }

    public String getCourseName() {
        return courseName;
    }

    public Integer getCourseDurationInHour() {
        return courseDurationInHour;
    }
}
