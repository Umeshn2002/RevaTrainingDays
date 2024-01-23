package com.tns.bank;

public class RBI {
	private String bankname;
	private String branch;
	public RBI() {
		System.out.println("Bank object created");
	}
	public RBI(String bankname, String branch) {
		super();
		this.bankname = bankname;
		this.branch = branch;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "RBI [bankname=" + bankname + ", branch=" + branch + "]";
	}
	
	
	
	

}
