package com.xzhang.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Title: WdDictType.java
 * @Package: com.xzhang.model
 * @Description: 数据字典表，作为字典主表：wd_dicttype
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年10月20日	        zx			创建
 ******************************************************** 
 */
public class WdDictType implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String dicttypecd;//字典代码:作为某个数据字段的唯一读取标示，不能重复
	private String dicttypename;//字典名称
	private String remark;//备注
	private Date createtime;//创建时间 
	private Date updatetime;//更新时间
	private String custcode;//创建人id
	private String custname;//创建人姓名
	
	private List<WdDictData> wdDictDatas;//数据字典从表集合
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDicttypecd() {
		return dicttypecd;
	}
	public void setDicttypecd(String dicttypecd) {
		this.dicttypecd = dicttypecd;
	}
	public String getDicttypename() {
		return dicttypename;
	}
	public void setDicttypename(String dicttypename) {
		this.dicttypename = dicttypename;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
	public String getCustcode() {
		return custcode;
	}
	public void setCustcode(String custcode) {
		this.custcode = custcode;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	
	
	public List<WdDictData> getWdDictDatas() {
		return wdDictDatas;
	}
	public void setWdDictDatas(List<WdDictData> wdDictDatas) {
		this.wdDictDatas = wdDictDatas;
	}
	
	

}
