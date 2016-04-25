package org.example.assertions.generated;

/**
 * Entry point for assertions of different data types. Each method in this class is a static factory for the
 * type-specific assertion objects.
 */
public interface Assertions extends com.github.aro_tech.tdd_mixins.AllAssertions {

  /**
   * Creates a new instance of <code>{@link org.example.AddressAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  default org.example.AddressAssert assertThat(org.example.Address actual) {
    return new org.example.AddressAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link org.example.CompanyAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  default org.example.CompanyAssert assertThat(org.example.Company actual) {
    return new org.example.CompanyAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link org.example.EmployeeAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  default org.example.EmployeeAssert assertThat(org.example.Employee actual) {
    return new org.example.EmployeeAssert(actual);
  }

}
