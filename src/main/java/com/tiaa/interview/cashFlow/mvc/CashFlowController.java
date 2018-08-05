package com.tiaa.interview.cashFlow.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tiaa.interview.cashFlow.bo.Branch;
import com.tiaa.interview.cashFlow.bo.CmFoodchain;
import com.tiaa.interview.cashFlow.service.CashFlowService;
import com.tiaa.interview.cashFlow.util.CashFlowUtil;

@RestController
public class CashFlowController {
	@Autowired
	CashFlowService cashFlowService;
	
	@Autowired
	CashFlowUtil util;

	@RequestMapping(value = "/branch", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public @ResponseBody Branch process(@RequestBody String payload) throws Exception {
		CmFoodchain request = null;
		if (payload != null && payload.startsWith("<")) {
			request = util.convertXmlToObject(payload);
		} else {
			request = util.convertJsonToObject(payload);
		}
		return cashFlowService.getBranchDetails(request);
	}




}
