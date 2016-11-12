package com.xzhang.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Title: WdCompanyInfo.java
 * @Package: com.xzhang.model
 * @Description: 公司信息表：wd_companyinfo
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年10月20日	        zx			创建
 ******************************************************** 
 */
public class WdCompanyInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String companyunique;//公司唯一识别码
	private String custcode;//上传人id
	private String custname;//上传人姓名
	private Date createtime;//创建时间 
	private Date updatetime;//更新时间
	private String companymobile;//公司电话
	private String companyadress;//公司地址
	private String companyemail;//公司邮箱
	private String comcustcodes;//公司负责人id，主要用来人物介绍
	private String spareone;//备用字段一
	private String sparetwo;//备用字段二
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompanyunique() {
		return companyunique;
	}
	public void setCompanyunique(String companyunique) {
		this.companyunique = companyunique;
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
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	public String getCompanymobile() {
		return companymobile;
	}
	public void setCompanymobile(String companymobile) {
		this.companymobile = companymobile;
	}
	public String getCompanyadress() {
		return companyadress;
	}
	public void setCompanyadress(String companyadress) {
		this.companyadress = companyadress;
	}
	public String getCompanyemail() {
		return companyemail;
	}
	public void setCompanyemail(String companyemail) {
		this.companyemail = companyemail;
	}
	public String getComcustcodes() {
		return comcustcodes;
	}
	public void setComcustcodes(String comcustcodes) {
		this.comcustcodes = comcustcodes;
	}
	public String getSpareone() {
		return spareone;
	}
	public void setSpareone(String spareone) {
		this.spareone = spareone;
	}
	public String getSparetwo() {
		return sparetwo;
	}
	public void setSparetwo(String sparetwo) {
		this.sparetwo = sparetwo;
	}
	
	
	
}
