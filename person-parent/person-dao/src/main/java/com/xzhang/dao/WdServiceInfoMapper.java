package com.xzhang.dao;

import java.util.List;
import java.util.Map;

import com.xzhang.model.WdServiceInfo;

/**
 * @Title: WdServiceInfoMapper.java
 * @Package: com.xzhang.dao
 * @Description: 服务信息dao层
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年10月21日	        zx			创建
 ******************************************************** 
 */
public interface WdServiceInfoMapper {
	
	/**
	 * 根据id找到WdServiceInfo对象
	 * 创建人：zx
	 * 2016年11月2日 下午1:51:21
	 * @param id
	 * @return
	 */
	public WdServiceInfo getWdServiceInfoById(String id);
	
	/**
	 * 根据id删除WdServiceInfo对象
	 * 创建人：zx
	 * 2016年11月2日 下午1:52:06
	 * @param id
	 */
	public void delWdServiceInfoById(String id);
	
	/**
	 * 新增一条WdServiceInfo对象信息
	 * 创建人：zx
	 * 2016年11月2日 下午2:15:42
	 * @param wdsi
	 */
	public void insertWdServiceInfo(WdServiceInfo wdsi);
	
	/**
	 * 更新WdServiceInfo对象
	 * 创建人：zx
	 * 2016年11月2日 下午5:47:01
	 * @param wdsi
	 */
	public void updateWdServiceInfoById(WdServiceInfo wdsi);
	
	/**
	 * 获取指定条数的WdServiceInfo对象列表
	 * 创建人：zx
	 * 2016年11月2日 下午5:55:56
	 * @param map
	 * @return
	 */
	public List<WdServiceInfo> getWdServiceInfoList(Map<String, Object> map);

}
