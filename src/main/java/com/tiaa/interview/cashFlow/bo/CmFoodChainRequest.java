package com.tiaa.interview.cashFlow.bo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CmFoodChainRequest {
	@XmlElement
	private Branch[] branches;
	
	@XmlElement
	private Orders orders;


}
