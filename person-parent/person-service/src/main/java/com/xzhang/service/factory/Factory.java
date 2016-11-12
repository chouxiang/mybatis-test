package com.xzhang.service.factory;

/**
 * @Title: Factory.java
 * @Package: com.xzhang.service.factory.Factory
 * @Description: 工厂类:目的是为了获取到具体的实现类对象
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年11月4日	        zx			创建
 ******************************************************** 
 */
public class Factory {
	
	/**
	 * 根据包类的全路径获取到对应的实现类
	 * 创建人：zx
	 * 2016年11月4日 下午3:00:13
	 * @param className
	 * @return
	 * @throws Exception
	 */
	public Object getValiadator(String className) throws Exception{  
        Class<?> cls = Class.forName(className);  
        Object obj = cls.newInstance();  
        return obj;  
    }

}
