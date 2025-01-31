package com.tnsif.constructerdemo;

public class Constucterdemo {
	private String custumername;
	private int customerid;
	private String customeradreess;

	
	Constucterdemo(){
		super();
	}

	public Constucterdemo(String custumername, int customerid, String customeradreess) {
		
		this.custumername = custumername;
		this.customerid = customerid;
		this.customeradreess = customeradreess;
	}

	
	public String getCustumername() {
		return custumername;
	}

	public void setCustumername(String custumername) {
		this.custumername = custumername;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomeradreess() {
		return customeradreess;
	}

	public void setCustomeradreess(String customeradreess) {
		this.customeradreess = customeradreess;
	}

	@Override
	public String toString() {
		return "Constucterdemo [custumername=" + custumername + ", customerid=" + customerid + ", customeradreess="
				+ customeradreess + "]";
	}
	
	
	

}
