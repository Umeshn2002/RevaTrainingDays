package com.tns.bank;

public class Karnataka extends RBI{
	private String AccholName;
	private int accountnumber;
	private String ifscCode;
	public Karnataka() {
		super();
	}
	public Karnataka(String bankname,String branch,String accholName, int accountnumber, String ifscCode) {
		super(bankname,branch);
		AccholName = accholName;
		this.accountnumber = accountnumber;
		this.ifscCode = ifscCode;
	}
	public String getAccholName() {
		return AccholName;
	}
	public void setAccholName(String accholName) {
		AccholName = accholName;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	@Override
	public String toString() {
		return "Karnataka [AccholName=" + AccholName + ", accountnumber=" + accountnumber + ", ifscCode=" + ifscCode
				+ ", getBankname()=" + getBankname() + ", getBranch()=" + getBranch() + "]";
	}
	
	
	

}
