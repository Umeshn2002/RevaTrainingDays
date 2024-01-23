//Program to demonstrate packages and access modifiers
package com.tns.day4.firstpackage;

public class Base {
	//Declaring Default,public,private,protected variables
	int varDefault=10;   //default w/o access modifier
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	//Declaring Default ,public,private,protected methods
	
	void methodDefault()
	{
		System.out.println("Default variable" +varDefault);
		System.out.println("Default method");
	}

	public void methodPublic()
	{
		System.out.println("Public variable" +varPublic);
		System.out.println("Public method");
	}
	
	private void methodPrivate()
	{
		System.out.println("Private variable" +varPrivate);
		System.out.println("Private method");
	}
	
	protected void methodProtected()
	{
		System.out.println("Protected variable" +varProtected);
		System.out.println("Protected method");
	}
	

}
