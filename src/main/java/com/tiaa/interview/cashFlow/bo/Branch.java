package com.tiaa.interview.cashFlow.bo;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;

public class Branch {
	@XmlElement
	private String location;
	@XmlElement
	private BigDecimal totalCollection;
	@XmlElement
	private BigDecimal sumOfOrder;
	@XmlElement
	private String locationId;
	private boolean isMatch;
	
	/**
	 * @param location
	 * @param totalCollection
	 * @param sumOfOrder
	 * @param locationId
	 */
	public Branch(String location, BigDecimal totalCollection, BigDecimal sumOfOrder, String locationId, boolean isMatch) {
		super();
		this.location = location;
		this.totalCollection = totalCollection;
		this.sumOfOrder = sumOfOrder;
		this.locationId = locationId;
		this.isMatch = isMatch;
	}
	
	/**
	 * @return the location
	 */
	protected String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	protected void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the totalCollection
	 */
	protected BigDecimal getTotalCollection() {
		return totalCollection;
	}
	/**
	 * @param totalCollection the totalCollection to set
	 */
	protected void setTotalCollection(BigDecimal totalCollection) {
		this.totalCollection = totalCollection;
	}
	/**
	 * @return the sumOfOrder
	 */
	protected BigDecimal getSumOfOrder() {
		return sumOfOrder;
	}
	/**
	 * @param sumOfOrder the sumOfOrder to set
	 */
	protected void setSumOfOrder(BigDecimal sumOfOrder) {
		this.sumOfOrder = sumOfOrder;
	}
	/**
	 * @return the locationId
	 */
	protected String getLocationId() {
		return locationId;
	}
	/**
	 * @param locationId the locationId to set
	 */
	protected void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	
	/**
	 * @return the isMatch
	 */
	protected boolean isMatch() {
		return isMatch;
	}

	/**
	 * @param isMatch the isMatch to set
	 */
	protected void setMatch(boolean isMatch) {
		this.isMatch = isMatch;
	}
	
	/**
	 * Location Id is unique
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((locationId == null) ? 0 : locationId.hashCode());
		return result;
	}
	
	/**
	 * Comparison on location id
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Branch)) {
			return false;
		}
		Branch other = (Branch) obj;
		if (locationId == null) {
			if (other.locationId != null) {
				return false;
			}
		} else if (!locationId.equals(other.locationId)) {
			return false;
		}
		return true;
	}
	
	/**
	 * Object representation
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Branch [" + (location != null ? "location=" + location + ", " : "")
				+ (totalCollection != null ? "totalCollection=" + totalCollection + ", " : "")
				+ (sumOfOrder != null ? "sumOfOrder=" + sumOfOrder + ", " : "")
				+ (locationId != null ? "locationId=" + locationId : "") + "]";
	}
	
	
}
