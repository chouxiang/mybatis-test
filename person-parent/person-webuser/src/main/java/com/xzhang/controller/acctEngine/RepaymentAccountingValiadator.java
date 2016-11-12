package com.xzhang.controller.acctEngine;

import com.alibaba.fastjson.JSON;
import com.xzhang.acctEngine.OrderBizType;
import com.xzhang.model.User;
import com.xzhang.service.IUserService;

public class RepaymentAccountingValiadator implements AccountingValiadator {
	
	private IUserService userService;

	@Override
	public void validate(User u, OrderBizType orderBizType) {
		
		System.out.println("PaymentAccountingValiadator打印："+JSON.toJSONStringWithDateFormat(u,"yyyy-MM-dd HH:mm:ss"));
		
	}
	
	
	
	public IUserService getUserService() {
		return userService;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
	

}
