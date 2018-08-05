package com.tiaa.interview.cashFlow.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.tiaa.interview.cashFlow.bo.Branch;
import com.tiaa.interview.cashFlow.bo.CmFoodchain;
import com.tiaa.interview.cashFlow.bo.OrderDetails;
import com.tiaa.interview.cashFlow.bo.Orders;

@Service
public class CashFlowService {
	
	public Branch getBranchDetails (CmFoodchain payload) throws Exception {
		
		BigDecimal sumOfEarnings = sumEarnings(payload);
		BigDecimal totalCollection = totalCollection(payload);
		String location = getLocation(payload);
		String locationId = getLocationId(payload);
		
		Branch branch = null;
		if (sumOfEarnings != totalCollection) {
			branch = new Branch(location, totalCollection, sumOfEarnings, locationId, false);
		} else {
			branch = new Branch(location, totalCollection, sumOfEarnings, locationId, true);
		}
		return branch;
	}
	
	private BigDecimal sumEarnings (CmFoodchain payload) throws Exception {
		BigDecimal sum = new BigDecimal(0D);
		Orders orders = payload.getOrders();
		OrderDetails[] od = orders.getOrderDetails();
		for (OrderDetails o: od) {
			sum = sum.add(o.getBillAmount());
		}
		return sum;
	}

	private BigDecimal totalCollection (CmFoodchain payload) throws Exception {
		BigDecimal totalCollectionAmount = new BigDecimal(0D);
		Branch branchObj = payload.getBranches();
		totalCollectionAmount = branchObj.getTotalCollection();
		return totalCollectionAmount;
	}
	
	private String getLocationId (CmFoodchain payload) throws Exception {
		String locationId = null;
		Branch branchObj = payload.getBranches();
		locationId = branchObj.getLocationId();
		return locationId;
	}
	
	private String getLocation (CmFoodchain payload) throws Exception {
		String location = null;
		Branch branchObj = payload.getBranches();
		location = branchObj.getLocation();
		return location;
	}
}
