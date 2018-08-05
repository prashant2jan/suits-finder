package com.tiaa.interview.cashFlow.util;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Repository;

import com.tiaa.interview.cashFlow.bo.CmFoodchain;

@Repository
public class CashFlowUtil {
	public CmFoodchain convertXmlToObject(String xml) throws Exception {
		StringReader sr = new StringReader(xml);
		JAXBContext jaxbContext = JAXBContext.newInstance(CmFoodchain.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		return (CmFoodchain) unmarshaller.unmarshal(sr);
	}

	public CmFoodchain convertJsonToObject(String json) throws Exception{
		StringReader sr = new StringReader(json);
		JAXBContext jaxbContext = JAXBContext.newInstance(CmFoodchain.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		unmarshaller.setProperty("eclipselink.media-type", "application/json");
		return (CmFoodchain) unmarshaller.unmarshal(sr);
	}
}