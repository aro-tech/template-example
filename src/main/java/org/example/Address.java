package org.example;

import java.util.Optional;

public class Address {
	final String streetAddress;
	final String city;
	final String postalCode;
	final Optional<String> stateOrTerritory;
	final String country;
	

	/**
	 * Constructor
	 * @param streetAddress
	 * @param city
	 * @param postalCode
	 * @param stateOrTerritory
	 * @param country
	 */
	public Address(String streetAddress, String city, String postalCode, String stateOrTerritory,
			String country) {
		super();
		this.streetAddress = streetAddress;
		this.city = city;
		this.postalCode = postalCode;
		this.stateOrTerritory = Optional.ofNullable(stateOrTerritory);
		this.country = country;
	}

	/**
	 * Constructor
	 * @param streetAddress
	 * @param city
	 * @param postalCode
	 * @param stateOrTerritory
	 * @param country
	 */
	public Address(String streetAddress, String city, String postalCode, 
			String country) {
		super();
		this.streetAddress = streetAddress;
		this.city = city;
		this.postalCode = postalCode;
		this.stateOrTerritory = Optional.ofNullable(null);
		this.country = country;
	}


	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}


	/**
	 * @return the stateOrTerritory
	 */
	public Optional<String> getStateOrTerritory() {
		return stateOrTerritory;
	}


	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [streetAddress=" + streetAddress + ", city=" + city + ", postalCode=" + postalCode
				+ ", stateOrTerritory=" + stateOrTerritory + ", country=" + country + "]";
	}
	
	
	
}
