package com.example.BeansLearner.Configs;

import com.example.BeansLearner.Classroom;
import com.example.BeansLearner.Instructors;
import com.example.BeansLearner.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean(name = "currentCohort")
    @DependsOn({"instructors", "students"})
    Classroom currentCohort(@Qualifier("instructors") Instructors instructors,
                            @Qualifier("students") Students students){
        return new Classroom(instructors, students);
    }

    @Bean("previousCohort")
    @DependsOn({"instructors", "previousStudents"})
    Classroom previousCohort(@Qualifier("instructors") Instructors instructors,
                             @Qualifier("previousStudents") Students students){
        return new Classroom(instructors, students);
    }
}
