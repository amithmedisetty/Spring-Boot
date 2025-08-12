package com.copart.springlearningdemo;

import org.springframework.stereotype.Component;

@Component("cricketcoaching")
public class CricketCoaching implements Coach{
    public String getPractice(){
        return "Practice Bowling for 10 hours";
    }
}
