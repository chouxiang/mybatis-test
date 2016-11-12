package com.xzhang.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Title: WdCustInfo.java
 * @Package: com.xzhang.model
 * @Description: 用户详细信息表：wd_custinfo
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年10月20日	        zx			创建
 ******************************************************** 
 */
public class WdCustInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String buyercode;//登录验证id
	private String name;//姓名
	private Date createtime;//创建时间
	private Date updatetime;//更新时间
	private String address;//个人地址（可为空）
	private String imgcode;//图片附件表的id，用来存放用户的头像图片。可以为空
	private String companymobile;//公司里面的固话座机、或者手机。可以为空
	private String companycode;//公司id
	private String position;//职位
	private String introduct;//个人简介
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBuyercode() {
		return buyercode;
	}
	public void setBuyercode(String buyercode) {
		this.buyercode = buyercode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getImgcode() {
		return imgcode;
	}
	public void setImgcode(String imgcode) {
		this.imgcode = imgcode;
	}
	public String getCompanymobile() {
		return companymobile;
	}
	public void setCompanymobile(String companymobile) {
		this.companymobile = companymobile;
	}
	public String getCompanycode() {
		return companycode;
	}
	public void setCompanycode(String companycode) {
		this.companycode = companycode;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getIntroduct() {
		return introduct;
	}
	public void setIntroduct(String introduct) {
		this.introduct = introduct;
	}
	
	

}
