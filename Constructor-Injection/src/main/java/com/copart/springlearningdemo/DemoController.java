package com.copart.springlearningdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    Coach coach;
    @Autowired
    public DemoController(Coach coach){
        this.coach=coach;
    }

    @GetMapping("/dailyWorkOuts")
    public String getDailyWorkouts(){
        return coach.getPractice();
    }
}
