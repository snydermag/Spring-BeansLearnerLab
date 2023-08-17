package com.example.BeansLearner;

public class Student extends Person implements Learner{

    double totalStudyTime;

    Student(Long id, String name) {
        super(id, name);
    }

    public void learn(double numberOfHours){
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
