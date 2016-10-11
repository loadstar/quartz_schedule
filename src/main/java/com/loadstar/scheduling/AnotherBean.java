package com.loadstar.scheduling;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Author:Andrew
 * Date:2016/10/8
 * Time:22:47
 */

@Component("anotherBean")
public class AnotherBean {
    public void printAnotherMessage(){
        System.out.println("I am called by Quartz jobBean using CronTriggerFactoryBean");
    }
}
