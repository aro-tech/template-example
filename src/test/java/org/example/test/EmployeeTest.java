/**
 * 
 */
package org.example.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.function.Predicate;

import org.example.Address;
import org.example.Company;
import org.example.Employee;
import org.junit.Test;

/**
 * Sample test class to demonstrate use of custom assertions mixins and
 * tdd-mixins-junit4
 * 
 * @author aro_tech
 *
 */
public class EmployeeTest implements org.example.assertions.generated.Assertions {
	final Address acmeHQ = new Address("1 Mobius Strip", "Fibonacci", "11235", "Atlantis");
	final Company acme = new Company("ACME", acmeHQ);
	final LocalDate entryDate = LocalDate.of(2015, Month.FEBRUARY, 14);
	final String employeeName = "Archimedes Brainiac";
	final Employee underTest = new Employee(employeeName, "Data Scientist", acme, entryDate);
	final Predicate<LocalDate> in2015 = d -> d.getYear() == 2015;

	final String expecting2015ErrorMsg = "expecting start date in 2015 but was %s";
	final String addressMatchingErrorMsg = "Expecting employer address postal code starting with 11";
	final String expectingScientistErrorMsg = "Some kind of scientist";

	/**
	 * old-style calls based on equals() or exact toString() match
	 */
	@Test
	public void test_using_normally_generated_methods() {
		
		assertThat(underTest).hasEmployer(acme).hasEntryDate(entryDate).hasName(employeeName)
				.hasTitle("Data Scientist");
		assertThat(underTest).hasToString(
				"Employee [name=Archimedes Brainiac, title=Data Scientist, employer=Company [name=ACME, address=Address [streetAddress=1 Mobius Strip, city=Fibonacci, postalCode=11235, stateOrTerritory=Optional.empty, country=Atlantis]], entryDate=2015-02-14]");

		// old style verifications of individual fields
		assertThat(underTest.getEntryDate()).matches(in2015, "Expecting an entry date in 2015");
		assertThat(underTest.getEmployer()).hasName("ACME").hasAddress(acmeHQ);
		assertThat(underTest.getEmployer().getAddress()).hasCity("Fibonacci").hasPostalCode("11235");
	}

	
	/**
	 * new-style calls (with much more flexible matching than just equals())
	 * ...enabled by my_has_assertion_template.txt:
	 */
	@Test
	public void test_using_custom_verification_methods() {
		assertThat(underTest).as(expecting2015ErrorMsg, underTest.getEntryDate()).hasEntryDateMatching(in2015)
				.hasEmployerMatching(emp -> {
					assertThat(emp).as(addressMatchingErrorMsg)
							.hasAddressMatching(addr -> addr.getPostalCode().startsWith("11"))
							.as("Expecting not Initrode").hasNameMatching(name -> !"Initrode".equals(name));
					return true;
				}).as(expectingScientistErrorMsg).hasTitleMatching(title -> title.contains("Scientist"));
		
		assertThat(underTest).hasEmployerAsString().doesNotContain("Initrode");
	}

	/**
	 * Plain old AssertJ, but inherited rather than imported statically
	 */
	@Test
	public void test_using_standard_assertj_via_tdd_mixins() {
		assertThat(47).isGreaterThan(42);
	}

}
