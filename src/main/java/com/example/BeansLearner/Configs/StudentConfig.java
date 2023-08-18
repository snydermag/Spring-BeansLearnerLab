package com.example.BeansLearner.Configs;

import com.example.BeansLearner.Instructors;
import com.example.BeansLearner.Student;
import com.example.BeansLearner.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    Students currentStudents(){
        Students current = new Students();
        current.add(new Student( 0, "Dima"));
        current.add(new Student( 1, "Surabhi"));
        current.add(new Student(2, "Joe"));
        current.add(new Student(3, "Danielle"));
        return current;
    }

    @Bean(name = "previousStudents")
    Students previousStudents(){
        Students previousStudents = new Students();
        previousStudents.add(new Student( 0, "Brent"));
        previousStudents.add(new Student( 1, "Olamide"));
        previousStudents.add(new Student(2, "Ricky"));
        previousStudents.add(new Student(3, "Santos"));
        return previousStudents;
    }

}
