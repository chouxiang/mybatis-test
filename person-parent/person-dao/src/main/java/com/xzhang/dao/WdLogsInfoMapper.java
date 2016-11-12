package com.xzhang.dao;

import java.util.List;
import java.util.Map;

import com.xzhang.model.WdLogsInfo;

/**
 * @Title: WdLogsInfoMapper.java
 * @Package: com.xzhang.dao
 * @Description: 系统日志dao层
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年10月21日	        zx			创建
 ******************************************************** 
 */
public interface WdLogsInfoMapper {
	
	/**
	 * 根据id找到WdLogsInfo对象
	 * 创建人：zx
	 * 2016年10月28日 下午1:27:31
	 * @param id
	 * @return
	 */
	public WdLogsInfo getWdLogsInfoById(String id);
	
	/**
	 * 根据cust_name、optype找到WdLogsInfo对象集合;
	 * 注：如果传入两个都为null，则表示查询整个表数据
	 * 创建人：zx
	 * 2016年10月28日 下午1:31:18
	 * @param map
	 * @return
	 */
	public List<WdLogsInfo> getWdLogsInfosByMap(Map<String, Object> map);
	
	/**
	 * 根据id删除WdLogsInfo对象
	 * 创建人：zx
	 * 2016年10月28日 下午1:40:07
	 * @param id
	 */
	public void delWdLogsInfoById(String id);
	
	/**
	 * 新增一条WdLogsInfo对象信息
	 * 创建人：zx
	 * 2016年10月28日 下午1:41:16
	 * @param wdls
	 */
	public void insertWdLogsInfo(WdLogsInfo wdls);

}
