package org.example;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;
import org.assertj.core.util.Objects;

/**
 * {@link Address} specific assertions - Generated by CustomAssertionGenerator.
 */
public class AddressAssert extends AbstractAssert<AddressAssert, Address> {

  /**
   * Creates a new <code>{@link AddressAssert}</code> to make assertions on actual Address.
   * @param actual the Address we want to make assertions on.
   */
  public AddressAssert(Address actual) {
    super(actual, AddressAssert.class);
  }

  /**
   * An entry point for AddressAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myAddress)</code> and get specific assertion with code completion.
   * @param actual the Address we want to make assertions on.
   * @return a new <code>{@link AddressAssert}</code>
   */
  public static AddressAssert assertThat(Address actual) {
    return new AddressAssert(actual).as("Generated assertion for Address");
  }
  


  /**
   * Verifies that the actual Address's city is equal to the given one.
   * @param city the given city to compare the actual Address's city to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Address's city is not equal to the given one.
   */
  public AddressAssert hasCity(String city) {
    // check that actual Address we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting city of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualCity = actual.getCity();
    if (!Objects.areEqual(actualCity, city)) {
      failWithMessage(assertjErrorMessage, actual, city, actualCity);
    }

    // return the current assertion for method chaining
    return this;
  }
  
  /**
   * Verifies that the actual Address's city matches the given Predicate.
   * @param cityPredicate the given Predicate to evaluate the actual Address's city.
   * @return this assertion object.
   * @throws AssertionError - if the actual Address's city does not match the given predicate.
   */
  public AddressAssert hasCityMatching(java.util.function.Predicate<String> cityPredicate) {
    // check that actual Address we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nProperty city of:\n  <%s>\nfailed to match a given Predicate";
    
    // null safe check
    String actualCity = actual.getCity();
    if (!cityPredicate.test(actualCity)) {
      failWithMessage(assertjErrorMessage, actual, actualCity);
    }

    // return the current assertion for method chaining
    return this;
  }
  
     /**
   * Maps this AddressAssert instance to a StringAssert on the toString of the actual object 
   * @return A StringAssert for the toString of this Assertion's actual object
   */
  public org.assertj.core.api.AbstractCharSequenceAssert<?, String> hasCityAsString() {
	    this.isNotNull();
		return org.assertj.core.api.Assertions.assertThat(actual.getCity()).asString();
  }

  /**
   * Verifies that the actual Address's country is equal to the given one.
   * @param country the given country to compare the actual Address's country to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Address's country is not equal to the given one.
   */
  public AddressAssert hasCountry(String country) {
    // check that actual Address we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting country of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualCountry = actual.getCountry();
    if (!Objects.areEqual(actualCountry, country)) {
      failWithMessage(assertjErrorMessage, actual, country, actualCountry);
    }

    // return the current assertion for method chaining
    return this;
  }
  
  /**
   * Verifies that the actual Address's country matches the given Predicate.
   * @param countryPredicate the given Predicate to evaluate the actual Address's country.
   * @return this assertion object.
   * @throws AssertionError - if the actual Address's country does not match the given predicate.
   */
  public AddressAssert hasCountryMatching(java.util.function.Predicate<String> countryPredicate) {
    // check that actual Address we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nProperty country of:\n  <%s>\nfailed to match a given Predicate";
    
    // null safe check
    String actualCountry = actual.getCountry();
    if (!countryPredicate.test(actualCountry)) {
      failWithMessage(assertjErrorMessage, actual, actualCountry);
    }

    // return the current assertion for method chaining
    return this;
  }
  
     /**
   * Maps this AddressAssert instance to a StringAssert on the toString of the actual object 
   * @return A StringAssert for the toString of this Assertion's actual object
   */
  public org.assertj.core.api.AbstractCharSequenceAssert<?, String> hasCountryAsString() {
	    this.isNotNull();
		return org.assertj.core.api.Assertions.assertThat(actual.getCountry()).asString();
  }

  /**
   * Verifies that the actual Address's postalCode is equal to the given one.
   * @param postalCode the given postalCode to compare the actual Address's postalCode to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Address's postalCode is not equal to the given one.
   */
  public AddressAssert hasPostalCode(String postalCode) {
    // check that actual Address we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting postalCode of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualPostalCode = actual.getPostalCode();
    if (!Objects.areEqual(actualPostalCode, postalCode)) {
      failWithMessage(assertjErrorMessage, actual, postalCode, actualPostalCode);
    }

    // return the current assertion for method chaining
    return this;
  }
  
  /**
   * Verifies that the actual Address's postalCode matches the given Predicate.
   * @param postalCodePredicate the given Predicate to evaluate the actual Address's postalCode.
   * @return this assertion object.
   * @throws AssertionError - if the actual Address's postalCode does not match the given predicate.
   */
  public AddressAssert hasPostalCodeMatching(java.util.function.Predicate<String> postalCodePredicate) {
    // check that actual Address we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nProperty postalCode of:\n  <%s>\nfailed to match a given Predicate";
    
    // null safe check
    String actualPostalCode = actual.getPostalCode();
    if (!postalCodePredicate.test(actualPostalCode)) {
      failWithMessage(assertjErrorMessage, actual, actualPostalCode);
    }

    // return the current assertion for method chaining
    return this;
  }
  
     /**
   * Maps this AddressAssert instance to a StringAssert on the toString of the actual object 
   * @return A StringAssert for the toString of this Assertion's actual object
   */
  public org.assertj.core.api.AbstractCharSequenceAssert<?, String> hasPostalCodeAsString() {
	    this.isNotNull();
		return org.assertj.core.api.Assertions.assertThat(actual.getPostalCode()).asString();
  }

  /**
   * Verifies that the actual Address's stateOrTerritory is equal to the given one.
   * @param stateOrTerritory the given stateOrTerritory to compare the actual Address's stateOrTerritory to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Address's stateOrTerritory is not equal to the given one.
   */
  public AddressAssert hasStateOrTerritory(java.util.Optional stateOrTerritory) {
    // check that actual Address we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting stateOrTerritory of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    java.util.Optional actualStateOrTerritory = actual.getStateOrTerritory();
    if (!Objects.areEqual(actualStateOrTerritory, stateOrTerritory)) {
      failWithMessage(assertjErrorMessage, actual, stateOrTerritory, actualStateOrTerritory);
    }

    // return the current assertion for method chaining
    return this;
  }
  
  /**
   * Verifies that the actual Address's stateOrTerritory matches the given Predicate.
   * @param stateOrTerritoryPredicate the given Predicate to evaluate the actual Address's stateOrTerritory.
   * @return this assertion object.
   * @throws AssertionError - if the actual Address's stateOrTerritory does not match the given predicate.
   */
  public AddressAssert hasStateOrTerritoryMatching(java.util.function.Predicate<java.util.Optional> stateOrTerritoryPredicate) {
    // check that actual Address we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nProperty stateOrTerritory of:\n  <%s>\nfailed to match a given Predicate";
    
    // null safe check
    java.util.Optional actualStateOrTerritory = actual.getStateOrTerritory();
    if (!stateOrTerritoryPredicate.test(actualStateOrTerritory)) {
      failWithMessage(assertjErrorMessage, actual, actualStateOrTerritory);
    }

    // return the current assertion for method chaining
    return this;
  }
  
     /**
   * Maps this AddressAssert instance to a StringAssert on the toString of the actual object 
   * @return A StringAssert for the toString of this Assertion's actual object
   */
  public org.assertj.core.api.AbstractCharSequenceAssert<?, String> hasStateOrTerritoryAsString() {
	    this.isNotNull();
		return org.assertj.core.api.Assertions.assertThat(actual.getStateOrTerritory()).asString();
  }

  /**
   * Verifies that the actual Address's streetAddress is equal to the given one.
   * @param streetAddress the given streetAddress to compare the actual Address's streetAddress to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Address's streetAddress is not equal to the given one.
   */
  public AddressAssert hasStreetAddress(String streetAddress) {
    // check that actual Address we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting streetAddress of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualStreetAddress = actual.getStreetAddress();
    if (!Objects.areEqual(actualStreetAddress, streetAddress)) {
      failWithMessage(assertjErrorMessage, actual, streetAddress, actualStreetAddress);
    }

    // return the current assertion for method chaining
    return this;
  }
  
  /**
   * Verifies that the actual Address's streetAddress matches the given Predicate.
   * @param streetAddressPredicate the given Predicate to evaluate the actual Address's streetAddress.
   * @return this assertion object.
   * @throws AssertionError - if the actual Address's streetAddress does not match the given predicate.
   */
  public AddressAssert hasStreetAddressMatching(java.util.function.Predicate<String> streetAddressPredicate) {
    // check that actual Address we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nProperty streetAddress of:\n  <%s>\nfailed to match a given Predicate";
    
    // null safe check
    String actualStreetAddress = actual.getStreetAddress();
    if (!streetAddressPredicate.test(actualStreetAddress)) {
      failWithMessage(assertjErrorMessage, actual, actualStreetAddress);
    }

    // return the current assertion for method chaining
    return this;
  }
  
     /**
   * Maps this AddressAssert instance to a StringAssert on the toString of the actual object 
   * @return A StringAssert for the toString of this Assertion's actual object
   */
  public org.assertj.core.api.AbstractCharSequenceAssert<?, String> hasStreetAddressAsString() {
	    this.isNotNull();
		return org.assertj.core.api.Assertions.assertThat(actual.getStreetAddress()).asString();
  }

}
