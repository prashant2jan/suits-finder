package com.tiaa.interview.cashFlow.bo;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;

public class OrderDetails {
	
	@XmlElement
	private Integer orderId;
	@XmlElement
	private BigDecimal billAmount;
	
	/**
	 * @return the orderId
	 */
	protected Integer getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	protected void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the billAmount
	 */
	protected BigDecimal getBillAmount() {
		return billAmount;
	}
	/**
	 * @param billAmount the billAmount to set
	 */
	protected void setBillAmount(BigDecimal billAmount) {
		this.billAmount = billAmount;
	}
	
}
