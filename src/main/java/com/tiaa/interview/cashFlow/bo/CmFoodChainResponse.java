package com.tiaa.interview.cashFlow.bo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CmFoodChainResponse {
	@XmlElement
	private Branch[] branches;

	/**
	 * @return the branches
	 */
	protected Branch[] getBranches() {
		return branches;
	}

	/**
	 * @param branches the branches to set
	 */
	protected void setBranches(Branch[] branches) {
		this.branches = branches;
	}
	
	
}
