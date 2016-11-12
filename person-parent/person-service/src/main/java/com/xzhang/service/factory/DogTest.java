package com.xzhang.service.factory;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.xzhang.acctEngine.FactoryType;
import com.xzhang.model.User;
import com.xzhang.service.IUserService;
import com.xzhang.web.SpringContextUtil;

/**
 * @Title: DogTest.java
 * @Package: com.xzhang.service.factory.DogTest
 * @Description: 狗实现类
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年11月4日	        zx			创建
 ******************************************************** 
 */
public class DogTest implements GodFactory {
	
	
	private IUserService userService = SpringContextUtil.getBean("userService");

	@Override
	public void getUserTest(User u, FactoryType factoryType) throws Exception {
		if(null == userService){
			System.out.println(userService);
		}
		System.out.println("DogTest打印："+JSON.toJSONStringWithDateFormat(u,"yyyy-MM-dd HH:mm:ss"));
		
	}
	
	
	
	
	
	

}
