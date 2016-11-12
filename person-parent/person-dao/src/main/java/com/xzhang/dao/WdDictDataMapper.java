package com.xzhang.dao;

import java.util.List;

import com.xzhang.model.WdDictData;

/**
 * @Title: WdDictDataMapper.java
 * @Package: com.xzhang.dao
 * @Description: 数据字典详细表，数据字典从表dao层
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年10月21日	        zx			创建
 ******************************************************** 
 */
public interface WdDictDataMapper {
	
	/**
	 * 根据id找到WdDictData对象
	 * 创建人：zx
	 * 2016年10月26日 下午1:13:02
	 * @param id
	 * @return
	 */
	public WdDictData getWdDictDataById(String id);
	
	/**
	 * 根据id删除WdDictData对象
	 * 创建人：zx
	 * 2016年10月26日 下午1:14:21
	 * @param id
	 */
	public void delWdDictDataById(String id);
	
	/**
	 * 新增一条WdDictData对象信息
	 * 创建人：zx
	 * 2016年10月26日 下午1:15:45
	 * @param wddd
	 */
	public void insertWdDictData(WdDictData wddd);
	
	/**
	 * 根据id更新WdDictData对象
	 * 创建人：zx
	 * 2016年10月26日 下午1:22:53
	 * @param wddd
	 */
	public void updateWdBuyerByMobile(WdDictData wddd);
	
	/**
	 * 根据数据字典主键id,去找到WdDictData集合
	 * 创建人：zx
	 * 2016年10月26日 下午1:29:15
	 * @param dicttypecode
	 * @return
	 */
	public List<WdDictData> getWdDictDatasByDicttypecode(String dicttypecode);

}
