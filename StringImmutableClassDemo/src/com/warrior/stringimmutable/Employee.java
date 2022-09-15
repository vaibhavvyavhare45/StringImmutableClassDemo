package com.warrior.stringimmutable;

import java.net.InetSocketAddress;

public final class Employee {
	private final int id;
	private final String nm;
	private  final  Address address;
//	public Employee() {
//		// TODO Auto-generated constructor stub
//		this.id=0;
//		this.nm=" ";
//		this.address=" ";
//	}
	public Employee(int id, String nm, Address address) {
		super();
		this.id = id;
		this.nm = nm;
		//this.address = address;
		Address cloneAdder=new Address();
		cloneAdder.setPin(address.getPin());
		cloneAdder.setCity(address.getCity());
		this.address=cloneAdder;
	}
	public int getId() {
		return id;
	}
	public String getNm() {
		return nm;
	}
	public Address getAddress() {
		Address dummyAdder=new Address();
		dummyAdder.setPin(this.address.getPin());
		dummyAdder.setCity(this.address.getCity());
		//return address;
		return dummyAdder;
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", nm=" + nm + ", address=" + address + "]";
	}
	
	

	

}
