package org.example;

public class Company {
	final String name;
	final Address address;
	/**
	 * Constructor
	 * @param name
	 * @param address
	 */
	public Company(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Company [name=" + name + ", address=" + address + "]";
	}
	
	
}
