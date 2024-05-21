package com.springboot.demo.mycoolapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


// Mark the class as Spring bean.
// Make it available for Dependency Injection
@Component
@Lazy
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practise fast bowling for 15 minutes !!!";
    }
}
