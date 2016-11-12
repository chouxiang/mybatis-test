package com.xzhang.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.xzhang.acctEngine.FactoryType;
import com.xzhang.acctEngine.OrderBizType;
import com.xzhang.controller.acctEngine.IAcctEngine;
import com.xzhang.model.User;
import com.xzhang.model.WdServiceInfo;
import com.xzhang.service.IUserService;
import com.xzhang.service.factory.IFactoryEngine;


@Controller
@RequestMapping("/userController")
public class UserController {
	
	private static final Logger log = Logger.getLogger(UserController.class);
	
	@Autowired
	private IUserService userService;
	@Autowired
	private IAcctEngine iAcctEngine;
	@Autowired
	private IFactoryEngine ifactoryEngine;
	
	
	/*
	 * 动态id访问
	 * @RequestMapping("/showUser/{id}.do")
	 * showUser(@PathVariable String id, HttpServletRequest request)
	 * */
	@RequestMapping("/showUser.do")
	public String showUser(String id, HttpServletRequest request) {
		User u = userService.getUserById(id);
		request.setAttribute("user", u);
		log.info(JSON.toJSONStringWithDateFormat(u,"yyyy-MM-dd HH:mm:ss"));
		
		try {
			if(null != iAcctEngine){
				iAcctEngine.printTestUser(u, OrderBizType.Payment);
			}
			if(null != ifactoryEngine){
				ifactoryEngine.getUserTest(u, FactoryType.ManTest);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "user/showUser";
	}
	

}
