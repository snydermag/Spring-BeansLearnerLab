package com.example.BeansLearner;

import java.util.Iterator;

public class Instructors extends People<Instructor>{

    public Instructors(Instructor...instructors){
        super(instructors);
    }

    @Override
    public Iterator<Instructor> iterator() {
        return personList.iterator();
    }
}
