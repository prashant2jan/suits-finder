package com.tiaa.interview.cashFlow.bo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="orders")
@XmlAccessorType(XmlAccessType.FIELD)
public class Orders {
	@XmlElement(name="orderdetail")
	private OrderDetails[] orderDetails;

	/**
	 * @return the orderDetails
	 */
	public OrderDetails[] getOrderDetails() {
		return orderDetails;
	}

	/**
	 * @param orderDetails the orderDetails to set
	 */
	public void setOrderDetails(OrderDetails[] orderDetails) {
		this.orderDetails = orderDetails;
	}
}
