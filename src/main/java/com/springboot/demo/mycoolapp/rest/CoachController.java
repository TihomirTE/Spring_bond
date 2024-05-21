package com.springboot.demo.mycoolapp.rest;

import com.springboot.demo.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {
    // define private field for the dependency
    private Coach myCoach;

    // define a constructor for dependency injection
    // Autowired - tells Spring to inject a dependency
    // Constructor Injection
    @Autowired
    public CoachController(@Qualifier("swimCoach") Coach theCoach){
        this.myCoach = theCoach;

        System.out.println("In constructor " + getClass().getSimpleName());
    }

    // Setter Injection
    /*@Autowired
    public void setCoach(Coach theCoach){
        this.myCoach = theCoach;
    }*/

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return  this.myCoach.getDailyWorkout();
    }
}
