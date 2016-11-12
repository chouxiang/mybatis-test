package com.xzhang.dao;

import java.util.List;
import java.util.Map;

import com.xzhang.model.WdProjectInfo;

/**
 * @Title: WdProjectInfoMapper.java
 * @Package: com.xzhang.dao
 * @Description: 项目案例dao层
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年10月21日	        zx			创建
 ******************************************************** 
 */
public interface WdProjectInfoMapper {
	
	/**
	 * 根据id找到WdProjectInfo对象
	 * 创建人：zx
	 * 2016年11月2日 上午11:10:30
	 * @param id
	 * @return
	 */
	public WdProjectInfo getWdProjectInfoById(String id);
	
	/**
	 * 根据id删除WdProjectInfo对象
	 * 创建人：zx
	 * 2016年11月2日 上午11:11:49
	 * @param id
	 */
	public void delWdProjectInfoById(String id);
	
	/**
	 * 新增一条WdProjectInfo对象信息
	 * 创建人：zx
	 * 2016年11月2日 上午11:16:59
	 * @param wdpj
	 */
	public void insertWdProjectInfo(WdProjectInfo wdpj);
	
	/**
	 * 更新WdProjectInfo对象
	 * 创建人：zx
	 * 2016年11月2日 下午1:13:05
	 * @param wdpj
	 */
	public void updateWdProjectInfoById(WdProjectInfo wdpj);
	
	/**
	 * 获取指定条数的WdProjectInfo对象列表
	 * 注：map[String title,int pageNum,int pageSize]
	 * 创建人：zx
	 * 2016年11月2日 下午1:23:55
	 * @param map
	 * @return
	 */
	public List<WdProjectInfo> getWdProjectInfoList(Map<String, Object> map);

}
