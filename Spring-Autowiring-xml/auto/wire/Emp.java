package com.springcore.auto.wire;

public class Emp {
 public Emp(Address address) {
		super();
		this.address = address;
	}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}

private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

 
}
