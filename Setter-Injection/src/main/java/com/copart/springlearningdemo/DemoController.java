package com.copart.springlearningdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;
//    Constructor Injection(recomended by spring.io dev team)
//    @Autowired
//    DemoController(Coach coach){
//        this.coach=coach;
//    }

    //Filed Injection(Not recomended by spring.io dev team)
//    @Autowired
//    private Coach coach;


// --->SetterInjection
    @Autowired
    public void setCoach(Coach coach){
        this.coach=coach;
    }
    @GetMapping("/dailyWorkOuts")
    public String getDailyWorkouts(){
        return coach.getPractice();
    }
}
