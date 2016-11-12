package com.xzhang.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.quartz.InterruptableJob;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.UnableToInterruptJobException;

import com.xzhang.model.User;
import com.xzhang.service.IUserService;
import com.xzhang.web.SpringContextUtil;

/**
 * 定时任务--打印测试定时任务是否成功
 * @author zx
 *
 */
public class TestQuartzTask implements InterruptableJob {
	protected Logger log = Logger.getLogger(this.getClass());
	private boolean _interrupted = false;
	
	/*此处引入相关的service*/
	private IUserService userService = SpringContextUtil.getBean("userService");
	

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		if(null == userService){
			System.out.println("userService为null");
		}
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sf.format(new Date())+
				"定时任务TestQuartzTask.class启动!!!");
		/*
		 * 获取所有的用户列表，并循环打印
		 * */
		List<User> users = userService.getAll();
		if(null != users && users.size()>0){
			for(User u : users){
				//判断是否点击了‘立刻停止’
				if(_interrupted) {  
	                 System.out.println("定时任务TestQuartzTask.class立刻停止!!!");
	                 return; 
	            }
				
				//System.out.println(sf.format(new Date())+":"+u.getName());
				for(int i=0;i<5;i++){
					for(int j=0;j<3;j++){
						System.out.println(sf.format(new Date())+":"+u.getName()+" ");
					}
				}
			}
		}
	}

	@Override
	public void interrupt() throws UnableToInterruptJobException {
		System.out.println("【关闭】interrupt执行立刻停止:test定时发送...");
		log.info("【关闭】interrupt执行立刻停止:test定时发送...");
		_interrupted = true;
	}

}
