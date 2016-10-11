package com.loadstar.scheduling;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Author:Andrew
 * Date:2016/10/8
 * Time:22:54
 */

@Component("myBean")
public class MyBean {
    public void printMessage() {
        System.out.println("I am called by MethodInvokingJobDetailFactoryBean using SimpleTriggerFactoryBean");
    }
}
