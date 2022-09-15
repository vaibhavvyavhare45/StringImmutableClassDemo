package com.warrior.stringimmutable;

public class TestImmutability {
	public static void main(String[] args) {
		Address ad=new Address(444403,"pune");
		Employee e1= new Employee(10,"Ram", ad);
		System.out.println("before changing e1: "+e1);
		//comment
		ad.city="mumbai";
		e1.getAddress().city="Dubai";
		System.out.println("After changing e1: "+e1);
	}

}
