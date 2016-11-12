package com.xzhang.dao;

import com.xzhang.model.WdImgFile;

/**
 * @Title: WdImgFileMapper.java
 * @Package: com.xzhang.dao
 * @Description: 图片附件dao层
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年10月21日	        zx			创建
 ******************************************************** 
 */
public interface WdImgFileMapper {
	
	/**
	 * 根据id找到WdImgFile对象
	 * 创建人：zx
	 * 2016年10月28日 上午11:17:14
	 * @param id
	 * @return
	 */
	public WdImgFile getWdImgFileById(String id);
	
	/**
	 * 新增一条WdImgFile对象信息
	 * 创建人：zx
	 * 2016年10月28日 上午11:41:39
	 * @param wdif
	 */
	public void insertWdImgFile(WdImgFile wdif);
	
	/**
	 * 更新WdImgFile对象
	 * 创建人：zx
	 * 2016年10月28日 下午1:19:29
	 * @param wdif
	 */
	public void updateWdImgFileById(WdImgFile wdif);

}
