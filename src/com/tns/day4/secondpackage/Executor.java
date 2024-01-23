package com.tns.day4.secondpackage;

import com.tns.day4.firstpackage.*;

public class Executor {

	public static void main(String[] args) {
		Person obj=new Person();
		obj.setName("umesh");
		obj.setCity("Bangalore");
		obj.setAge(21);
		System.out.println(obj );
		
		Base obj2=new Base();
		obj2.varPublic=100;
		obj2.methodPublic();
		

	}

}
