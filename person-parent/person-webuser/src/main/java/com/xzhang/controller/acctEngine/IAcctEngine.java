package com.xzhang.controller.acctEngine;

import com.xzhang.acctEngine.OrderBizType;
import com.xzhang.model.User;

/**
 * @Title: IAcctEngine.java
 * @Package: com.xzhang.controller.acctEngine
 * @Description: 多态继承 接口
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年11月3日	        zx			创建
 ******************************************************** 
 */
public interface IAcctEngine {
	
	/**
	 * 测试打印user
	 * 创建人：zx
	 * 2016年11月3日 下午5:12:29
	 * @param u
	 */
	public void printTestUser(User u,OrderBizType orderBizType) throws Exception;
	
}
