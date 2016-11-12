package com.xzhang.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Title: WdLogsInfo.java
 * @Package: com.xzhang.model
 * @Description: 系统日志表：wd_logsinfo
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年10月20日	        zx			创建
 ******************************************************** 
 */
public class WdLogsInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String custcode;//操作人id
	private String custname;//操作人姓名
	private Date createtime;//操作时间 
	private String optype;//操作类型：从数据字典里取
	private String contect;//操作内容
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getOptype() {
		return optype;
	}
	public void setOptype(String optype) {
		this.optype = optype;
	}
	public String getContect() {
		return contect;
	}
	public void setContect(String contect) {
		this.contect = contect;
	}
	
	
	

}
