package com.xzhang.dao;

import java.util.List;

import com.xzhang.model.WdDictType;

/**
 * @Title: WdDictTypeMapper.java
 * @Package: com.xzhang.dao
 * @Description: 数据字典表，作为字典主表dao层
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年10月21日	        zx			创建
 ******************************************************** 
 */
public interface WdDictTypeMapper {
	
	/**
	 * 根据主表id找到一对多查询信息
	 * 创建人：zx
	 * 2016年10月27日 下午5:07:41
	 * @param id
	 * @return
	 */
	public WdDictType getWdDictTypeById(String id);
	
	/**
	 * 获取所有一对多查询信息
	 * 创建人：zx
	 * 2016年10月27日 下午5:16:17
	 * @return
	 */
	public List<WdDictType> getWdDictTypes();
	
	/**
	 * 新增一条WdDictType对象信息
	 * 创建人：zx
	 * 2016年10月27日 下午5:21:48
	 * @param wddt
	 */
	public void insertWdDictType(WdDictType wddt);
	
	/**
	 * 更新WdDictType对象
	 * 创建人：zx
	 * 2016年10月27日 下午6:26:56
	 * @param wddt
	 */
	public void updateWdDictTypeById(WdDictType wddt);

}
