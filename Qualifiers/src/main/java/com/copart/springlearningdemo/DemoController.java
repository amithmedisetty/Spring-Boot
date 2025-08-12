package com.copart.springlearningdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {
    private Coach coach;
    @Autowired
    public DemoController(@Qualifier("footballcoaching") Coach thecoach){
        this.coach=thecoach;
    }

    @Autowired
    @Qualifier("cricketcoaching")
    private CricketCoaching coach1;

    @GetMapping("/cricketWorkout")
    public String getCricketWorkouts(){
        return coach1.getPractice();
    }

    @GetMapping("/footballWorkout")
    public String getFootballWorkouts(){
        return coach.getPractice();
    }

    @Autowired
    List<Coach> l;

    @GetMapping("/allWorkouts")
    public ArrayList<String> test(){
        ArrayList<String> al=new ArrayList<>();
        for(Coach c:l){
            al.add(c.getPractice());
        }
        return al;
    }


    //checking for protype bean check
    @Autowired
    @Qualifier("footballcoaching")
    Coach footcoach;

    @Autowired
    @Qualifier("footballcoaching")
    Coach footcoach1;

    @GetMapping("/check")
    public boolean check(){
        if(footcoach == footcoach1){
            return true;
        }
        return false;
    }
}
