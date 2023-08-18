package com.example.BeansLearner;

public class Student extends Person implements Learner{

    double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }

    public Student(){
        super();
    }

    public void learn(double numberOfHours){
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
