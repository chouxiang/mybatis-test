package com.xzhang.dao;

import com.xzhang.model.WdCustInfo;

/**
 * @Title: WdCustInfoMapper.java
 * @Package: com.xzhang.dao
 * @Description: 用户详细信息dao层
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年10月21日	        zx			创建
 ******************************************************** 
 */
public interface WdCustInfoMapper {
	
	/**
	 * 根据buyercode找到WdCustInfo对象
	 * 创建人：zx
	 * 2016年10月24日 上午11:22:51
	 * @param buyercode
	 * @return
	 */
	public WdCustInfo getWdCustInfoByBuyercode(String buyercode);
	
	/**
	 * 根据buyercode删除WdCustInfo对象
	 * 创建人：zx
	 * 2016年10月24日 上午11:30:50
	 * @param buyercode
	 */
	public void delWdCustInfoByBuyercode(String buyercode);
	
	/**
	 * 新增一条WdCustInfo对象信息
	 * 创建人：zx
	 * 2016年10月24日 上午11:33:48
	 * @param wdcs
	 */
	public void insertWdCustInfo(WdCustInfo wdcs);
	
	/**
	 * 根据buyercode更新WdCustInfo对象
	 * 创建人：zx
	 * 2016年10月24日 下午2:00:37
	 * @param wdcs
	 */
	public void updateWdCustInfoByBuyercode(WdCustInfo wdcs);

}
