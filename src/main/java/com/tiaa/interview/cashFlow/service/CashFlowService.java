package com.tiaa.interview.cashFlow.service;

import java.math.BigDecimal;

import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;

import com.tiaa.interview.cashFlow.bo.Branch;
import com.tiaa.interview.cashFlow.bo.CmFoodChainRequest;

@Service
public class CashFlowService {
	
	public Branch getBranchDetails (HttpEntity<CmFoodChainRequest> payload) throws Exception {
		String strResult = EntityUtils.toString((org.apache.http.HttpEntity) payload); 
		JSONObject jsonResult = new JSONObject(strResult);
		BigDecimal sumOfEarnings = sumEarnings(jsonResult);
		BigDecimal totalCollection = totalCollection(jsonResult);
		String location = getLocation(jsonResult);
		String locationId = getLocationId(jsonResult);
		Branch branch = null;
		if (sumOfEarnings != totalCollection) {
			branch = new Branch(location, totalCollection, sumOfEarnings, locationId, false);
		} else {
			branch = new Branch(location, totalCollection, sumOfEarnings, locationId, true);
		}
		return branch;
	}
	
	private BigDecimal sumEarnings (JSONObject payload) throws Exception {
		BigDecimal sum = new BigDecimal(0D);
		JSONArray ordersList = payload.getJSONArray("orders");
		for (int i = 0, size = ordersList.length(); i < size; i++) {
			JSONObject objectInArray = ordersList.getJSONObject(i);
			sum = sum.add(new BigDecimal(objectInArray.getDouble("billamount")));
		}
		return sum;
	}

	private BigDecimal totalCollection (JSONObject payload) throws Exception {
		BigDecimal totalCollectionAmount = new BigDecimal(0D);
		JSONObject branchObj = payload.getJSONObject("branch");
		totalCollectionAmount = new BigDecimal(branchObj.getDouble("totalcollection"));
		return totalCollectionAmount;
	}
	
	private String getLocationId (JSONObject payload) throws Exception {
		String locationId = null;
		JSONObject branchObj = payload.getJSONObject("branch");
		locationId = branchObj.getString("locationid");
		return locationId;
	}
	
	private String getLocation (JSONObject payload) throws Exception {
		String location = null;
		JSONObject branchObj = payload.getJSONObject("branch");
		location = branchObj.getString("location");
		return location;
	}
}
