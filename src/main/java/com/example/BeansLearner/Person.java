package com.example.BeansLearner;

public class Person {

    final long id;

    String name;

    public Person(long id, String name){
        this.id = id;
        this.name = name;
    }

    public Person(){
        this.id = 0;
        this.name = null;
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
