package com.example.BeansLearner;

import java.util.Iterator;

public class Instructor extends Person implements Teacher{

    public Instructor(long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours){
        learner.learn(numberOfHours);
    }

    public void lecture(Iterable<? extends Learner> learners, double numberOfHours){
        double numberOfHoursPerLearner;
        long count = 0;

        for (Learner l : learners){
            count++;
        }

        if (count > 0){
            numberOfHoursPerLearner = numberOfHours / count;

            learners.forEach(learner -> learner.learn(numberOfHoursPerLearner));
        }

    }
}
