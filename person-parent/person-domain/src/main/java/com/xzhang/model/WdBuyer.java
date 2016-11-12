package com.xzhang.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Title: WdBuyer.java
 * @Package: com.xzhang.model
 * @Description: 登录验证表：wd_buyer
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年10月20日	        zx			创建
 ******************************************************** 
 */
public class WdBuyer implements Serializable {
	private static final long serialVersionUID = 1L;
	/**是否禁止登录:0禁用*/
	public static final String STATUS_NO = "0";
	/**是否禁止登录:1启用*/
	public static final String STATUS_YES = "1";
	
	
	private String id;
	private String firstname;//姓名
	private String mobile;//手机号
	private String password;//密码(密码初次添加的时候是发送随机的8位数字，并通过MD5加密保存)
	private Date createtime;//创建时间 
	private String email;//邮箱必填，并通过数据字典加载后面的@qq.com、@163.com等等
	private String status = WdBuyer.STATUS_YES;//状态
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
