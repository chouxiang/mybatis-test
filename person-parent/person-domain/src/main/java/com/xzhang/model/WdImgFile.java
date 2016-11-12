package com.xzhang.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Title: WdImgFile.java
 * @Package: com.xzhang.model
 * @Description: 图片附件表：wd_imgfile
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年10月20日	        zx			创建
 ******************************************************** 
 */
public class WdImgFile implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String imgpath;//图片路径：把图片上传到ftp服务器，只要返回文件夹图片名当做路径
	private String imgtype;//图片类型：从数据字典里取出来，再保存到这里
	private Date createtime;//创建时间
	private Date updatetime;//更新时间
	private String custcode;//上传人id
	private String custname;//上传人姓名
	private String describe;//描述
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImgpath() {
		return imgpath;
	}
	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}
	public String getImgtype() {
		return imgtype;
	}
	public void setImgtype(String imgtype) {
		this.imgtype = imgtype;
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
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	
	
	

}
