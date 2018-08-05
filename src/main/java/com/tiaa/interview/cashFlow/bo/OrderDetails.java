package com.tiaa.interview.cashFlow.bo;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="orderdetail")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderDetails {
	
	@XmlElement(name="orderid")
	private Integer orderId;
	@XmlElement(name="billamount")
	private BigDecimal billAmount;
	
	/**
	 * @return the orderId
	 */
	public Integer getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the billAmount
	 */
	public BigDecimal getBillAmount() {
		return billAmount;
	}
	/**
	 * @param billAmount the billAmount to set
	 */
	public void setBillAmount(BigDecimal billAmount) {
		this.billAmount = billAmount;
	}
	
}
