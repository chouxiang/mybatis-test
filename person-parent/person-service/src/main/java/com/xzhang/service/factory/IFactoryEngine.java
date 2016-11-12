package com.xzhang.service.factory;

import com.xzhang.acctEngine.FactoryType;
import com.xzhang.acctEngine.OrderBizType;
import com.xzhang.model.User;

/**
 * @Title: IFactoryEngine.java
 * @Package: com.xzhang.service.factory.IFactoryEngine
 * @Description: Java反射机制的工厂模式
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年11月4日	        zx			创建
 ******************************************************** 
 */
public interface IFactoryEngine {
	
	/**
	 * 对外暴露的接口
	 * 创建人：zx
	 * 2016年11月4日 下午2:55:09
	 * @param u
	 * @param orderBizType
	 * @throws Exception
	 */
	public void getUserTest(User u,FactoryType factoryType) throws Exception;

}
