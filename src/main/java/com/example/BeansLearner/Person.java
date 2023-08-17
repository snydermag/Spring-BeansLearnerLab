package com.example.BeansLearner;

public class Person {

    final Long id;

    String name;

    Person(Long id, String name){
        this.id = id;
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
