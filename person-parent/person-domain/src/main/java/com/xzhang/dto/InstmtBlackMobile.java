package com.xzhang.dto;

import java.io.Serializable;
import java.util.Date;


public class InstmtBlackMobile implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;//主键id
	
	private String orgLostContact;//机构失联
	
	private String bankLostContact;//银行失联
	
	private String orgOverduePeriod;//机构逾期期数
	
	private String orgLitigation;//机构诉讼
	
	private String bankLitigation;//银行诉讼
	
	private String orgBlackList;//列为黑名单的机构
	
	private String orgOneMonthOvedue;//开户30天有逾期
	
	private String matchType;//匹配查询的类型
	
	private String matchValue;//匹配查询类型的值
	
	private String matchId;//匹配查询到的imsi的md5值
	
	private Date createTime;//创建时间
	
	private long buyer_id;//buyer对象的id
	
	private String bankOverduePeriod;//银行逾期期数

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOrgLostContact() {
		return orgLostContact;
	}

	public void setOrgLostContact(String orgLostContact) {
		this.orgLostContact = orgLostContact;
	}

	public String getBankLostContact() {
		return bankLostContact;
	}

	public void setBankLostContact(String bankLostContact) {
		this.bankLostContact = bankLostContact;
	}

	
	public String getOrgOverduePeriod() {
		return orgOverduePeriod;
	}

	public void setOrgOverduePeriod(String orgOverduePeriod) {
		this.orgOverduePeriod = orgOverduePeriod;
	}

	public String getOrgLitigation() {
		return orgLitigation;
	}

	public void setOrgLitigation(String orgLitigation) {
		this.orgLitigation = orgLitigation;
	}

	public String getBankLitigation() {
		return bankLitigation;
	}

	public void setBankLitigation(String bankLitigation) {
		this.bankLitigation = bankLitigation;
	}

	public String getOrgBlackList() {
		return orgBlackList;
	}

	public void setOrgBlackList(String orgBlackList) {
		this.orgBlackList = orgBlackList;
	}

	public String getOrgOneMonthOvedue() {
		return orgOneMonthOvedue;
	}

	public void setOrgOneMonthOvedue(String orgOneMonthOvedue) {
		this.orgOneMonthOvedue = orgOneMonthOvedue;
	}

	public String getMatchType() {
		return matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public String getMatchValue() {
		return matchValue;
	}

	public void setMatchValue(String matchValue) {
		this.matchValue = matchValue;
	}

	public String getMatchId() {
		return matchId;
	}

	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public long getBuyer_id() {
		return buyer_id;
	}

	public void setBuyer_id(long buyer_id) {
		this.buyer_id = buyer_id;
	}

	public String getBankOverduePeriod() {
		return bankOverduePeriod;
	}

	public void setBankOverduePeriod(String bankOverduePeriod) {
		this.bankOverduePeriod = bankOverduePeriod;
	}
	
	
	

}
