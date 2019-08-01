package com.fdmgroup.abstractclass;

public class BusinessAccountHolder extends AccountHolder{
	
	private String businessType;
	private long vatNumber;
	
	
	
	public BusinessAccountHolder(String name, long id, String postcode,
			String telephone, String businessType, long vatNumber) {
		super(name, id, postcode, telephone);
		this.businessType = businessType;
		this.vatNumber = vatNumber;
	}
	
	//getters and setters
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public long getVatNumber() {
		return vatNumber;
	}
	public void setVatNumber(long vatNumber) {
		this.vatNumber = vatNumber;
	}
	
	

}
