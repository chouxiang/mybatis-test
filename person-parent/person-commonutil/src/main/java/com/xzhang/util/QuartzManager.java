package com.xzhang.util;

import java.util.Date;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

/**  
* @Title: QuartzManager.java
* @Package com.xzhang.util
* @Description: TODO(定时任务管理类)
* @author zx  
* @date 2016-8-22 下午3:28:57
*/ 
public class QuartzManager {
	
	private static SchedulerFactory gSchedulerFactory = new StdSchedulerFactory();  
    private static String JOB_GROUP_NAME = "EXTJWEB_JOBGROUP_NAME";  
    private static String TRIGGER_GROUP_NAME = "EXTJWEB_TRIGGERGROUP_NAME";  
  
    /** 
     * @Description: 添加一个定时任务，使用默认的任务组名，触发器名，触发器组名 
     *  
     * @param jobName 
     *            任务名 
     * @param cls 
     *            任务 
     * @param time 
     *            时间设置，参考quartz说明文档 
     *  
     * @Title: QuartzManager.java 
     * @Copyright: Copyright (c) 2014 
     *  
     * @author Comsys-LZP 
     * @date 2014-6-26 下午03:47:44 
     * @version V2.0 
     */  
    @SuppressWarnings("unchecked")  
    public static void addJob(String jobName, Class cls, String time) {  
        try {  
            Scheduler sched = gSchedulerFactory.getScheduler();  
            JobDetail jobDetail = new JobDetail(jobName, JOB_GROUP_NAME, cls);// 任务名，任务组，任务执行类  
            // 触发器  
            CronTrigger trigger = new CronTrigger(jobName, TRIGGER_GROUP_NAME);// 触发器名,触发器组  
            trigger.setCronExpression(time);// 触发器时间设定  
            sched.scheduleJob(jobDetail, trigger);  
            // 启动  
            if (!sched.isShutdown()) {  
                sched.start();  
            }  
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
    }  
  
    /** 
     * @Description: 添加一个定时任务 
     *  
     * @param jobName 
     *            任务名 
     * @param jobGroupName 
     *            任务组名 
     * @param triggerName 
     *            触发器名 
     * @param triggerGroupName 
     *            触发器组名 
     * @param jobClass 
     *            任务 
     * @param time 
     *            时间设置，参考quartz说明文档 
     *  
     * @Title: QuartzManager.java 
     * @Copyright: Copyright (c) 2014 
     *  
     * @author Comsys-LZP 
     * @date 2014-6-26 下午03:48:15 
     * @version V2.0 
     */  
    @SuppressWarnings("unchecked")  
    public static void addJob(String jobName, String jobGroupName,  
            String triggerName, String triggerGroupName, Class jobClass,  
            String time) {  
        try {  
            Scheduler sched = gSchedulerFactory.getScheduler();  
            JobDetail jobDetail = new JobDetail(jobName, jobGroupName, jobClass);// 任务名，任务组，任务执行类  
            // 触发器  
            CronTrigger trigger = new CronTrigger(triggerName, triggerGroupName);// 触发器名,触发器组  
            trigger.setCronExpression(time);// 触发器时间设定  
            sched.scheduleJob(jobDetail, trigger);
            // 启动  
            if (!sched.isShutdown()) {  
                sched.start();  
            } 
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
    }  
  
    /** 
     * @Description: 修改一个任务的触发时间(使用默认的任务组名，触发器名，触发器组名) 
     *  
     * @param jobName 
     * @param time 
     *  
     * @Title: QuartzManager.java 
     * @Copyright: Copyright (c) 2014 
     *  
     * @author Comsys-LZP 
     * @date 2014-6-26 下午03:49:21 
     * @version V2.0 
     */  
    @SuppressWarnings("unchecked")  
    public static void modifyJobTime(String jobName, String time) {  
        try {  
            Scheduler sched = gSchedulerFactory.getScheduler();  
            CronTrigger trigger = (CronTrigger) sched.getTrigger(jobName,TRIGGER_GROUP_NAME);  
            if (trigger == null) {  
                return;  
            }  
            String oldTime = trigger.getCronExpression();  
            if (!oldTime.equalsIgnoreCase(time)) {  
                JobDetail jobDetail = sched.getJobDetail(jobName,JOB_GROUP_NAME);  
                Class objJobClass = jobDetail.getJobClass();  
                removeJob(jobName);  
                addJob(jobName, objJobClass, time);  
            }  
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
    }  
  
    /** 
     * @Description: 修改一个任务的触发时间 
     *  
     * @param triggerName 
     * @param triggerGroupName 
     * @param time 
     *  
     * @Title: QuartzManager.java 
     * @Copyright: Copyright (c) 2014 
     *  
     * @author Comsys-LZP 
     * @date 2014-6-26 下午03:49:37 
     * @version V2.0 
     */  
    public static void modifyJobTime(String triggerName,  
            String triggerGroupName, String time) {  
        try {  
            Scheduler sched = gSchedulerFactory.getScheduler();  
            CronTrigger trigger = (CronTrigger) sched.getTrigger(triggerName,triggerGroupName);  
            if (trigger == null) {  
                return;  
            }  
            String oldTime = trigger.getCronExpression();  
            if (!oldTime.equalsIgnoreCase(time)) {  
                CronTrigger ct = (CronTrigger) trigger;  
                // 修改时间  
                ct.setCronExpression(time);  
                // 重启触发器  
                sched.resumeTrigger(triggerName, triggerGroupName);  
            }  
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
    }  
    
    /**
     * 更新任务时间：先移除、再新增
     * @param triggerName
     * @param triggerGroupName
     * @param time
     */
    public static void modifyJobTimeTrue(String jobName, String jobGroupName,  
            String triggerName, String triggerGroupName, Class jobClass,  
            String time){
    	//先移除
    	removeJob(jobName, jobGroupName, triggerName, triggerGroupName);
    	//再新增
    	addJob(jobName, jobGroupName, triggerName, triggerGroupName, jobClass, time);
    }
  
    /** 
     * @Description: 移除一个任务(使用默认的任务组名，触发器名，触发器组名) 
     *  
     * @param jobName 
     *  
     * @Title: QuartzManager.java 
     * @Copyright: Copyright (c) 2014 
     *  
     * @author Comsys-LZP 
     * @date 2014-6-26 下午03:49:51 
     * @version V2.0 
     */  
    public static void removeJob(String jobName) {  
        try {  
            Scheduler sched = gSchedulerFactory.getScheduler();  
            sched.pauseTrigger(jobName, TRIGGER_GROUP_NAME);// 停止触发器  
            sched.unscheduleJob(jobName, TRIGGER_GROUP_NAME);// 移除触发器  
            sched.deleteJob(jobName, JOB_GROUP_NAME);// 删除任务  
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
    }  
  
    /** 
     * @Description: 移除一个任务 
     *  
     * @param jobName 
     * @param jobGroupName 
     * @param triggerName 
     * @param triggerGroupName 
     *  
     * @Title: QuartzManager.java 
     * @Copyright: Copyright (c) 2014 
     *  
     * @author Comsys-LZP 
     * @date 2014-6-26 下午03:50:01 
     * @version V2.0 
     */  
    public static void removeJob(String jobName, String jobGroupName,  
            String triggerName, String triggerGroupName) {  
        try {  
            Scheduler sched = gSchedulerFactory.getScheduler();  
            sched.pauseTrigger(triggerName, triggerGroupName);// 停止触发器  
            sched.unscheduleJob(triggerName, triggerGroupName);// 移除触发器  
            sched.deleteJob(jobName, jobGroupName);// 删除任务  
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
    }  
  
    /** 
     * @Description:启动所有定时任务 
     *  
     *  
     * @Title: QuartzManager.java 
     * @Copyright: Copyright (c) 2014 
     *  
     * @author Comsys-LZP 
     * @date 2014-6-26 下午03:50:18 
     * @version V2.0 
     */  
    public static void startJobs() {  
        try {  
            Scheduler sched = gSchedulerFactory.getScheduler();  
            sched.start();  
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
    }  
  
    /** 
     * @Description:关闭所有定时任务 
     *  
     *  
     * @Title: QuartzManager.java 
     * @Copyright: Copyright (c) 2014 
     *  
     * @author Comsys-LZP 
     * @date 2014-6-26 下午03:50:26 
     * @version V2.0 
     */  
    public static void shutdownJobs() {  
        try {  
            Scheduler sched = gSchedulerFactory.getScheduler();  
            if (!sched.isShutdown()) {  
                sched.shutdown();  
            }  
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
    }
    
    /** 
     * 停止一个job任务 
     * @param jobkey 
     * @throws SchedulerException 
     */  
    public static void pauseJob(String jobName, String groupName,String triggerName) throws SchedulerException  { 
    	Scheduler sched = gSchedulerFactory.getScheduler();
    	//sched.pauseTrigger(triggerName, groupName);
    	//sched.pauseJob(jobName, groupName);
    	sched.interrupt(jobName, groupName);
    }
    
    /** 
     * 恢复相关的job任务 
     * @param jobkey 
     * @throws SchedulerException 
     */  
    public static void resumeJob(String jobName, String groupName,String triggerName) throws SchedulerException {  
    	Scheduler sched = gSchedulerFactory.getScheduler();
    	//sched.resumeTrigger(triggerName, groupName);
    	sched.resumeJob(jobName, groupName);  
    }
    
    /**
     * 立刻执行一次job :获取到所要执行的class，然后直接出发class中的execute方法
     * @param jobName
     * @param groupName
     * @param triggerName
     * @throws SchedulerException
     */
    public static void rescheduleJob(String jobName, String groupName,String classname,
    		String triggerName,String triggerGroup) throws SchedulerException {  
    	Scheduler sched = gSchedulerFactory.getScheduler();
    	
    }

}
