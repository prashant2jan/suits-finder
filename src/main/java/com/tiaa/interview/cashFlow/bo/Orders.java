package com.tiaa.interview.cashFlow.bo;

import javax.xml.bind.annotation.XmlElement;

public class Orders {
	@XmlElement
	private OrderDetails[] orderDetails;

	/**
	 * @return the orderDetails
	 */
	protected OrderDetails[] getOrderDetails() {
		return orderDetails;
	}

	/**
	 * @param orderDetails the orderDetails to set
	 */
	protected void setOrderDetails(OrderDetails[] orderDetails) {
		this.orderDetails = orderDetails;
	}
}
