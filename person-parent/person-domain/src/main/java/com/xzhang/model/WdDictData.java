package com.xzhang.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Title: WdDictData.java
 * @Package: com.xzhang.model
 * @Description: 数据字典详细表，数据字典从表：wd_dictdata
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年10月20日	        zx			创建
 ******************************************************** 
 */
public class WdDictData implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String dictcd;//代码是详细字典的唯一标示，不能重复
	private String dictname;//代码名称
	private String dictorderno;//序号可以用来检索的顺序
	private String remark;//备注
	private String dicttypecode;//数据字典主键id
	private Date createtime;//创建时间
	private Date updatetime;//更新时间
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDictcd() {
		return dictcd;
	}
	public void setDictcd(String dictcd) {
		this.dictcd = dictcd;
	}
	public String getDictname() {
		return dictname;
	}
	public void setDictname(String dictname) {
		this.dictname = dictname;
	}
	public String getDictorderno() {
		return dictorderno;
	}
	public void setDictorderno(String dictorderno) {
		this.dictorderno = dictorderno;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getDicttypecode() {
		return dicttypecode;
	}
	public void setDicttypecode(String dicttypecode) {
		this.dicttypecode = dicttypecode;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	
	
	

}
