package org.example;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;
import org.assertj.core.util.Objects;

/**
 * {@link Employee} specific assertions - Generated by CustomAssertionGenerator.
 */
public class EmployeeAssert extends AbstractAssert<EmployeeAssert, Employee> {

  /**
   * Creates a new <code>{@link EmployeeAssert}</code> to make assertions on actual Employee.
   * @param actual the Employee we want to make assertions on.
   */
  public EmployeeAssert(Employee actual) {
    super(actual, EmployeeAssert.class);
  }

  /**
   * An entry point for EmployeeAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myEmployee)</code> and get specific assertion with code completion.
   * @param actual the Employee we want to make assertions on.
   * @return a new <code>{@link EmployeeAssert}</code>
   */
  public static EmployeeAssert assertThat(Employee actual) {
    return new EmployeeAssert(actual).as("Generated assertion for Employee");
  }
  


  /**
   * Verifies that the actual Employee's employer is equal to the given one.
   * @param employer the given employer to compare the actual Employee's employer to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Employee's employer is not equal to the given one.
   */
  public EmployeeAssert hasEmployer(Company employer) {
    // check that actual Employee we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting employer of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Company actualEmployer = actual.getEmployer();
    if (!Objects.areEqual(actualEmployer, employer)) {
      failWithMessage(assertjErrorMessage, actual, employer, actualEmployer);
    }

    // return the current assertion for method chaining
    return this;
  }
  
  /**
   * Verifies that the actual Employee's employer matches the given Predicate.
   * @param employerPredicate the given Predicate to evaluate the actual Employee's employer.
   * @return this assertion object.
   * @throws AssertionError - if the actual Employee's employer does not match the given predicate.
   */
  public EmployeeAssert hasEmployerMatching(java.util.function.Predicate<Company> employerPredicate) {
    // check that actual Employee we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nProperty employer of:\n  <%s>\nfailed to match a given Predicate";
    
    // null safe check
    Company actualEmployer = actual.getEmployer();
    if (!employerPredicate.test(actualEmployer)) {
      failWithMessage(assertjErrorMessage, actual, actualEmployer);
    }

    // return the current assertion for method chaining
    return this;
  }
  
     /**
   * Maps this EmployeeAssert instance to a StringAssert on the toString of the actual object 
   * @return A StringAssert for the toString of this Assertion's actual object
   */
  public org.assertj.core.api.AbstractCharSequenceAssert<?, String> hasEmployerAsString() {
	    this.isNotNull();
		return org.assertj.core.api.Assertions.assertThat(actual.getEmployer()).asString();
  }

  /**
   * Verifies that the actual Employee's entryDate is equal to the given one.
   * @param entryDate the given entryDate to compare the actual Employee's entryDate to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Employee's entryDate is not equal to the given one.
   */
  public EmployeeAssert hasEntryDate(java.time.LocalDate entryDate) {
    // check that actual Employee we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting entryDate of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    java.time.LocalDate actualEntryDate = actual.getEntryDate();
    if (!Objects.areEqual(actualEntryDate, entryDate)) {
      failWithMessage(assertjErrorMessage, actual, entryDate, actualEntryDate);
    }

    // return the current assertion for method chaining
    return this;
  }
  
  /**
   * Verifies that the actual Employee's entryDate matches the given Predicate.
   * @param entryDatePredicate the given Predicate to evaluate the actual Employee's entryDate.
   * @return this assertion object.
   * @throws AssertionError - if the actual Employee's entryDate does not match the given predicate.
   */
  public EmployeeAssert hasEntryDateMatching(java.util.function.Predicate<java.time.LocalDate> entryDatePredicate) {
    // check that actual Employee we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nProperty entryDate of:\n  <%s>\nfailed to match a given Predicate";
    
    // null safe check
    java.time.LocalDate actualEntryDate = actual.getEntryDate();
    if (!entryDatePredicate.test(actualEntryDate)) {
      failWithMessage(assertjErrorMessage, actual, actualEntryDate);
    }

    // return the current assertion for method chaining
    return this;
  }
  
     /**
   * Maps this EmployeeAssert instance to a StringAssert on the toString of the actual object 
   * @return A StringAssert for the toString of this Assertion's actual object
   */
  public org.assertj.core.api.AbstractCharSequenceAssert<?, String> hasEntryDateAsString() {
	    this.isNotNull();
		return org.assertj.core.api.Assertions.assertThat(actual.getEntryDate()).asString();
  }

  /**
   * Verifies that the actual Employee's name is equal to the given one.
   * @param name the given name to compare the actual Employee's name to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Employee's name is not equal to the given one.
   */
  public EmployeeAssert hasName(String name) {
    // check that actual Employee we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting name of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualName = actual.getName();
    if (!Objects.areEqual(actualName, name)) {
      failWithMessage(assertjErrorMessage, actual, name, actualName);
    }

    // return the current assertion for method chaining
    return this;
  }
  
  /**
   * Verifies that the actual Employee's name matches the given Predicate.
   * @param namePredicate the given Predicate to evaluate the actual Employee's name.
   * @return this assertion object.
   * @throws AssertionError - if the actual Employee's name does not match the given predicate.
   */
  public EmployeeAssert hasNameMatching(java.util.function.Predicate<String> namePredicate) {
    // check that actual Employee we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nProperty name of:\n  <%s>\nfailed to match a given Predicate";
    
    // null safe check
    String actualName = actual.getName();
    if (!namePredicate.test(actualName)) {
      failWithMessage(assertjErrorMessage, actual, actualName);
    }

    // return the current assertion for method chaining
    return this;
  }
  
     /**
   * Maps this EmployeeAssert instance to a StringAssert on the toString of the actual object 
   * @return A StringAssert for the toString of this Assertion's actual object
   */
  public org.assertj.core.api.AbstractCharSequenceAssert<?, String> hasNameAsString() {
	    this.isNotNull();
		return org.assertj.core.api.Assertions.assertThat(actual.getName()).asString();
  }

  /**
   * Verifies that the actual Employee's title is equal to the given one.
   * @param title the given title to compare the actual Employee's title to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Employee's title is not equal to the given one.
   */
  public EmployeeAssert hasTitle(String title) {
    // check that actual Employee we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting title of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualTitle = actual.getTitle();
    if (!Objects.areEqual(actualTitle, title)) {
      failWithMessage(assertjErrorMessage, actual, title, actualTitle);
    }

    // return the current assertion for method chaining
    return this;
  }
  
  /**
   * Verifies that the actual Employee's title matches the given Predicate.
   * @param titlePredicate the given Predicate to evaluate the actual Employee's title.
   * @return this assertion object.
   * @throws AssertionError - if the actual Employee's title does not match the given predicate.
   */
  public EmployeeAssert hasTitleMatching(java.util.function.Predicate<String> titlePredicate) {
    // check that actual Employee we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nProperty title of:\n  <%s>\nfailed to match a given Predicate";
    
    // null safe check
    String actualTitle = actual.getTitle();
    if (!titlePredicate.test(actualTitle)) {
      failWithMessage(assertjErrorMessage, actual, actualTitle);
    }

    // return the current assertion for method chaining
    return this;
  }
  
     /**
   * Maps this EmployeeAssert instance to a StringAssert on the toString of the actual object 
   * @return A StringAssert for the toString of this Assertion's actual object
   */
  public org.assertj.core.api.AbstractCharSequenceAssert<?, String> hasTitleAsString() {
	    this.isNotNull();
		return org.assertj.core.api.Assertions.assertThat(actual.getTitle()).asString();
  }

}