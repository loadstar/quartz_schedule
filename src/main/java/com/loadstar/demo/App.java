package com.loadstar.demo;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */

public class App
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println("Hello World!");


        /**
        // Define scheduler
        SchedulerFactory sf = new StdSchedulerFactory();
        Scheduler sched = sf.getScheduler();

        // Define job
        JobDetail job = JobBuilder.newJob(HelloJob.class)
                .withIdentity("job1", "group1")
                .build();

        // Define trigger strategy
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger1", "group1")
                .withSchedule(CronScheduleBuilder.cronSchedule("0/20 * * * * ?"))
                .build();
        sched.scheduleJob(job, trigger);
        // Start the job
        sched.start();
        Thread.sleep(90L * 1000L);
        sched.shutdown(true);
        */
        String location = "applicationContext-common.xml";
         AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[] {location});

        /**
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                context.stop();
            }
        });
        */

        /**
        Thread shutdownHookOne = new Thread() {
            public void run() {
                context.stop();
            }
        };
        Runtime.getRuntime().addShutdownHook(shutdownHookOne);
         */
    }
}
