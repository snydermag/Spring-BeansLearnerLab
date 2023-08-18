package com.example.BeansLearner.Configs;

import com.example.BeansLearner.Instructors;
import com.example.BeansLearner.Instructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorConfig {

    @Bean(name = "tcUsa")
    Instructors tcUsaInstructors(){
        Instructors tcUsa = new Instructors();
        tcUsa.add(new Instructor(0, "Kelly"));
        tcUsa.add(new Instructor(1, "Brad"));
        tcUsa.add(new Instructor(2, "Sam"));
        return tcUsa;
    }

    @Bean(name = "tcUk")
    Instructors tcUkInstructors(){
        Instructors tcUk = new Instructors();
        tcUk.add(new Instructor(0, "Scary"));
        tcUk.add(new Instructor(1, "Baby"));
        tcUk.add(new Instructor(2, "Posh"));
        return tcUk;
    }

    @Bean
    @Primary
    public Instructors instructors(){
        Instructors tcZcw = new Instructors();
        tcZcw.add(new Instructor(0,"Kris"));
        tcZcw.add(new Instructor(1,"Dan"));
        tcZcw.add(new Instructor(2, "Dolio"));
        tcZcw.add(new Instructor(3,"Razz"));
        return tcZcw;
    }

}
