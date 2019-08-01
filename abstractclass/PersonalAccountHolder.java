package com.fdmgroup.abstractclass;

public class PersonalAccountHolder extends AccountHolder {
	
	private String nationalInsuranceNumber;
	

	public PersonalAccountHolder(String name, long id, String postcode, String telephone,
			String nationalInsuranceNumber) {
		super(name, id, postcode, telephone);
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}

	public String getNationalInsuranceNumber() {
		return nationalInsuranceNumber;
	}

	public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}
	

}
