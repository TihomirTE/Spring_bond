package com.springboot.demo.mycoolapp.common;

public class SwimCoach implements Coach{
    public SwimCoach(){
        System.out.println("In contructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters";
    }
}
