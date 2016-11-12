package com.xzhang.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Title: WdServiceInfo.java
 * @Package: com.xzhang.model
 * @Description: 服务信息表：wd_serviceinfo
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年10月20日	        zx			创建
 ******************************************************** 
 */
public class WdServiceInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String tiltle;//标题
	private String contect;//内容
	private String servicetype;//服务类型也从数据字典里取出来，此处只是存入类型值，到时用类型值去字典里找到详细的信息
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
	public String getTiltle() {
		return tiltle;
	}
	public void setTiltle(String tiltle) {
		this.tiltle = tiltle;
	}
	public String getContect() {
		return contect;
	}
	public void setContect(String contect) {
		this.contect = contect;
	}
	public String getServicetype() {
		return servicetype;
	}
	public void setServicetype(String servicetype) {
		this.servicetype = servicetype;
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
