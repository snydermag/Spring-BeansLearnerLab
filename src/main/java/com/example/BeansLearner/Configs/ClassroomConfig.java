package com.example.BeansLearner.Configs;

import com.example.BeansLearner.Classroom;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassroomConfig {

    @Bean
    Classroom currentCohort(){
        return null;
    }

    @Bean
    Classroom previousCohort(){
        return null;
    }
}
