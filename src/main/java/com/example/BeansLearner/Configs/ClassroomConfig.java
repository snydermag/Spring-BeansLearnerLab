package com.example.BeansLearner.Configs;

import com.example.BeansLearner.Classroom;
import com.example.BeansLearner.Instructors;
import com.example.BeansLearner.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    Students students;

    Instructors instructors;

    Students previousStudents;

    @Bean
    @DependsOn({"instructors", "students"})
    Classroom currentCohort(){
        return new Classroom(instructors, students);
    }

    @Bean
    @DependsOn({"instructors", "previousStudents"})
    Classroom previousCohort(){
        return new Classroom(instructors, previousStudents);
    }
}
