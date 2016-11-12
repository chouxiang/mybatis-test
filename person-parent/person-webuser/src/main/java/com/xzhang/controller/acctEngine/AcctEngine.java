package com.xzhang.controller.acctEngine;

import com.xzhang.acctEngine.OrderBizType;
import com.xzhang.model.User;

public class AcctEngine implements IAcctEngine {
	
	private AccountingValiadator  paymentAccountingValiadator;
    
    private AccountingValiadator  paymentRefundAccountingValiadator;
    
    private AccountingValiadator  repaymentAccountingValiadator;

	@Override
	public void printTestUser(User u,OrderBizType orderBizType) throws Exception {
		AccountingValiadator valiadator = null;
        switch (orderBizType)
        {
            case Payment:
                valiadator = this.paymentAccountingValiadator;
                break;
            case PaymentRefund:
                valiadator = this.paymentRefundAccountingValiadator;
                break;
            case Repayment:
                valiadator = this.repaymentAccountingValiadator;
                break;
            default:
                throw new Exception("未知的交易业务类型");
        }
		
        //执行对应的方法
        valiadator.validate(u, orderBizType);
        
	}
	
	
	
	
	public AccountingValiadator getPaymentAccountingValiadator() {
		return paymentAccountingValiadator;
	}
	
	public void setPaymentAccountingValiadator(
			AccountingValiadator paymentAccountingValiadator) {
		this.paymentAccountingValiadator = paymentAccountingValiadator;
	}
	
	public AccountingValiadator getPaymentRefundAccountingValiadator() {
		return paymentRefundAccountingValiadator;
	}
	public void setPaymentRefundAccountingValiadator(
			AccountingValiadator paymentRefundAccountingValiadator) {
		this.paymentRefundAccountingValiadator = paymentRefundAccountingValiadator;
	}

	public AccountingValiadator getRepaymentAccountingValiadator() {
		return repaymentAccountingValiadator;
	}
	public void setRepaymentAccountingValiadator(
			AccountingValiadator repaymentAccountingValiadator) {
		this.repaymentAccountingValiadator = repaymentAccountingValiadator;
	}
	

}
