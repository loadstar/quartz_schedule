package com.loadstar.demo;

import com.loadstar.scheduling.AnotherBean;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;


/**
 * Created with IntelliJ IDEA.
 * Author:Andrew
 * Date:2016/10/8
 * Time:22:45
 */


public class ScheduledJob extends QuartzJobBean {

    private AnotherBean anotherBean;

    @Override
    protected void executeInternal(JobExecutionContext arg0)
            throws JobExecutionException {
        anotherBean.printAnotherMessage();
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }
}
