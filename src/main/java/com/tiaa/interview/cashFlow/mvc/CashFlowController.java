package com.tiaa.interview.cashFlow.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tiaa.interview.cashFlow.bo.Branch;
import com.tiaa.interview.cashFlow.bo.CmFoodChainRequest;
import com.tiaa.interview.cashFlow.service.CashFlowService;

@RestController
public class CashFlowController {
	@Autowired
	CashFlowService cashFlowService;

	@RequestMapping(value = "/process", method = RequestMethod.POST, consumes = "text/plain")
	public @ResponseBody Branch process(@RequestBody HttpEntity<CmFoodChainRequest> payload) throws Exception {
		Branch branch = null;
		if (payload != null) {
			if (payload.getHeaders().getContentType().equals("application/json")) {
				branch = cashFlowService.getBranchDetails(payload);
			}
		}
		return branch;
	}
}
