package com.fdmgroup.abstractclass;

public abstract class AccountHolder {
	
	private String name;
	private long id;
	private String postcode;
	private String telephone;
	
	
	public AccountHolder(String name, long id, String postcode, String telephone) {
		super();
		this.name = name;
		this.id = id;
		this.postcode = postcode;
		this.telephone = telephone;
	}
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	

}
