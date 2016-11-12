package com.xzhang.dao;

import com.xzhang.model.WdCompanyInfo;

/**
 * @Title: WdCompanyInfoMapper.java
 * @Package: com.xzhang.dao
 * @Description: 公司信息dao层
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年10月21日	        zx			创建
 ******************************************************** 
 */
public interface WdCompanyInfoMapper {
	
	/**
	 * 根据公司唯一识别码找到公司信息
	 * 创建人：zx
	 * 2016年10月24日 上午10:47:04
	 * @param companyunique
	 * @return
	 */
	public WdCompanyInfo getWdCompanyByUnique(String companyunique);
	
	/**
	 * 新增一条WdCompanyInfo对象信息
	 * 创建人：zx
	 * 2016年10月24日 上午10:56:06
	 * @param wdci
	 */
	public void insertWdCompany(WdCompanyInfo wdci);
	
	/**
	 * 根据唯一标示码更新WdCompanyInfo对象
	 * 创建人：zx
	 * 2016年10月24日 上午11:03:05
	 * @param wdci
	 */
	public void updateWdCompanyByUnique(WdCompanyInfo wdci);

}
