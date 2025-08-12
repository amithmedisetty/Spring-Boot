package com.copart.springlearningdemo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("footballcoaching")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)  //by default bean scope is singleton i explicitly making prototype so each time it creates new instance
public class FootballCoaching implements Coach{
    @Override
    public String getPractice() {
        return "Practicing Football for 2 hrs";
    }
}
