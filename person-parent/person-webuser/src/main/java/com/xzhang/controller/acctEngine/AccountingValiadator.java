package com.xzhang.controller.acctEngine;

import com.xzhang.acctEngine.OrderBizType;
import com.xzhang.model.User;

public interface AccountingValiadator {
	
	/**
	 * 测试打印user
	 * 创建人：zx
	 * 2016年11月3日 下午5:12:29
	 * @param u
	 */
	public void validate(User u,OrderBizType orderBizType);

}
