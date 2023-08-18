package com.example.BeansLearner.Configs;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentConfigTest {

    @Autowired
    private StudentConfig config;
    @Test
    void currentStudents() {
    }

    @Test
    void previousStudents() {
    }
}