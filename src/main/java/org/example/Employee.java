package org.example;

import java.time.LocalDate;

public class Employee {
	final String name;
	final String title;
	final Company employer;
	final LocalDate entryDate;
	
	/**
	 * Constructor
	 * @param name
	 * @param title
	 * @param employer
	 * @param entryDate
	 */
	public Employee(String name, String title, Company employer, LocalDate entryDate) {
		super();
		this.name = name;
		this.title = title;
		this.employer = employer;
		this.entryDate = entryDate;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the employer
	 */
	public Company getEmployer() {
		return employer;
	}

	/**
	 * @return the entryDate
	 */
	public LocalDate getEntryDate() {
		return entryDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", title=" + title + ", employer=" + employer + ", entryDate=" + entryDate
				+ "]";
	}
	
}
