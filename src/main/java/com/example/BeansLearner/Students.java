package com.example.BeansLearner;

import java.util.Iterator;

public class Students extends People<Student>{

    public Students(Student...students){
        super(students);
    }

    public Students(){
        this(new Student());
    }

    @Override
    public Iterator<Student> iterator() {
        return personList.iterator();
    }
}
