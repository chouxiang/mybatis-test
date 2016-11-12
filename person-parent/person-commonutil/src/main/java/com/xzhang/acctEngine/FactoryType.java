package com.xzhang.acctEngine;


/**
 * @Title: FactoryType.java
 * @Package: com.xzhang.acctEngine
 * @Description: Java反射代理的工厂实现类的数据
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年11月4日	        zx			创建
 ******************************************************** 
 */
public enum FactoryType {
	
	ManTest("ManTest", "com.xzhang.service.factory.ManTest"),
	DogTest("DogTest", "com.xzhang.service.factory.DogTest");
	
	
	private String code;
	private String desc;
	
	private FactoryType(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
	public static String getDescByCode(String code) {
		FactoryType[] values = FactoryType.values();
		for (FactoryType status : values) {
			if (status.getCode().equals(code)) {
				return status.getDesc();
			}
		}
		return null;
	}

}
