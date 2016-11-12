package com.xzhang.dto;

import java.io.Serializable;

public class BlackMobileDto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String success;
	
	private String errors;
	
	private String status;
	
	private BlackMobileOthersDto data;
	
	

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getErrors() {
		return errors;
	}

	public void setErrors(String errors) {
		this.errors = errors;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BlackMobileOthersDto getData() {
		return data;
	}

	public void setData(BlackMobileOthersDto data) {
		this.data = data;
	}
	
	

}
