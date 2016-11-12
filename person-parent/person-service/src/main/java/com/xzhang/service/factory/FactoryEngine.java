package com.xzhang.service.factory;

import com.xzhang.acctEngine.FactoryType;
import com.xzhang.model.User;

public class FactoryEngine implements IFactoryEngine {
	
	//声明工厂类
	private Factory factory = new Factory();
	
	
	@Override
	public void getUserTest(User u,FactoryType factoryType) throws Exception {
		//工厂获取到对应的实现类
		GodFactory god = (GodFactory) factory.getValiadator(factoryType.getDesc()); 
		god.getUserTest(u, factoryType);
	}

}
