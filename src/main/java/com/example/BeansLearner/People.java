package com.example.BeansLearner;

import java.util.ArrayList;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType>{

    List<PersonType> personList = new ArrayList<>();

    public People(List<PersonType> peeps){
        personList = peeps;
    }

    public People(PersonType...personTypes){
        for (PersonType p : personTypes){
            personList.add(p);
        }
    }

    public void add(PersonType person){
        personList.add(person);
    }

    public void remove(PersonType person){
        personList.remove(person);
    }

    public int size(){
        return personList.size();
    }

    public void clear(){
        personList.clear();
    }

    void addAll(Iterable<PersonType> peeps){
        for(PersonType p : peeps){
            personList.add(p);
        }
    }

    PersonType findById(long id){
        for (PersonType p : personList){
            if (p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

    public List<PersonType> findAll(){
        return personList;
    }
}
