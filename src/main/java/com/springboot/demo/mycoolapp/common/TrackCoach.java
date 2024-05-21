package com.springboot.demo.mycoolapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    @PostConstruct
    public void doStartupStuff(){
        System.out.println("In doStartupStuff() " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doCleanupStuff(){
        System.out.println("In doCleanupStuff() " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}
