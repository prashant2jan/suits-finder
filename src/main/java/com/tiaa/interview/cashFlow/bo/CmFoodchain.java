package com.tiaa.interview.cashFlow.bo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="cmfoodchain")
@XmlAccessorType(XmlAccessType.FIELD)
public class CmFoodchain {
	@XmlElement(name="branch")
	private Branch branches;
	
	@XmlElement(name="orders")
	private Orders orders;

	/**
	 * @return the branches
	 */
	public Branch getBranches() {
		return branches;
	}

	/**
	 * @param branches the branches to set
	 */
	public void setBranches(Branch branches) {
		this.branches = branches;
	}

	/**
	 * @return the orders
	 */
	public Orders getOrders() {
		return orders;
	}

	/**
	 * @param orders the orders to set
	 */
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
}
