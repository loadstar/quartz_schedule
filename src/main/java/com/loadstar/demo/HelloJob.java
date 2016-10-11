package com.loadstar.demo;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created with IntelliJ IDEA.
 * Author:Andrew
 * Date:2016/10/8
 * Time:22:07
 */
public class HelloJob implements Job {
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("job started...");
    }
}

