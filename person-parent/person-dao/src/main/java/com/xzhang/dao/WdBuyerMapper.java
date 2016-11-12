package com.xzhang.dao;

import com.xzhang.model.WdBuyer;

/**
 * @Title: WdBuyerMapper.java
 * @Package: com.xzhang.dao
 * @Description: 登录信息验证dao层
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年10月21日	        zx			创建
 ******************************************************** 
 */
public interface WdBuyerMapper {
	
	/**
	 * 根据手机号找到WdBuyer对象
	 * @param mobile
	 * @return
	 */
	public WdBuyer getWdBuyerByMobile(String mobile);
	
	/**
	 * 根据手机号删除WdBuyer对象
	 * @param mobile
	 */
	public void delWdBuyerByMobile(String mobile);
	
	
	/**
	 * 新增一条WdBuyer对象信息
	 * 创建人：zx
	 * 2016年10月21日 下午2:47:27
	 * @param wb
	 */
	public void insertWdBuyer(WdBuyer wb);
	
	/**
	 * 更新WdBuyer对象
	 * 创建人：zx
	 * 2016年10月21日 下午3:03:04
	 * @param wb
	 */
	public void updateWdBuyerByMobile(WdBuyer wb);

}
