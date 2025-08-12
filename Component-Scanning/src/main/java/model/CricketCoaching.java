package model;

import org.springframework.stereotype.Component;

@Component
public class CricketCoaching implements Coach {
    public String getPractice(){
        return "Practice Bowling for 15 minutes";
    }
}
