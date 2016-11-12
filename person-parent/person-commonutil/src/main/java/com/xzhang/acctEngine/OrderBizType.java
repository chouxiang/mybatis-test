package com.xzhang.acctEngine;

/**
 * 订单业务动作类型
 * @author zx
 *
 */
public enum OrderBizType {

	Payment,//消费
	Topup,//储值，对应时序方式mapping
	Repayment,//还款，对应指定特定Deal方式mapping
	TopupRefund, //还款后退款退款
	PaymentRefund, //消费后未还款退款
	Installment,//分期业务
	Release, //冻结释放
	InstmtOrder, //助学贷业务
	InstmtRelease; //助学贷释放
}
