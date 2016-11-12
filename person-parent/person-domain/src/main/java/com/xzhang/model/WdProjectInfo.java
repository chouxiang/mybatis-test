package com.xzhang.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Title: WdProjectInfo.java
 * @Package: com.xzhang.model
 * @Description: 项目案例表：wd_projectinfo
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年10月20日	        zx			创建
 ******************************************************** 
 */
public class WdProjectInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String title;//标题
	private String contect;//内容
	private String firstimgcode;//第一张图片id
	private String imgcodes;//图片id逗号拼接
	private String custcode;//创建人id
	private String custname;//创建人姓名
	private Date createtime;//创建时间 
	private Date updatetime;//更新时间
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContect() {
		return contect;
	}
	public void setContect(String contect) {
		this.contect = contect;
	}
	public String getFirstimgcode() {
		return firstimgcode;
	}
	public void setFirstimgcode(String firstimgcode) {
		this.firstimgcode = firstimgcode;
	}
	public String getImgcodes() {
		return imgcodes;
	}
	public void setImgcodes(String imgcodes) {
		this.imgcodes = imgcodes;
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
	
	
	

}
