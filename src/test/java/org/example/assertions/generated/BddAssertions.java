package org.example.assertions.generated;

/**
 * Entry point for BDD assertions of different data types. Each method in this class is a static factory for the
 * type-specific assertion objects.
 */
public class BddAssertions {

  /**
   * Creates a new instance of <code>{@link org.example.AddressAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static org.example.AddressAssert then(org.example.Address actual) {
    return new org.example.AddressAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link org.example.CompanyAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static org.example.CompanyAssert then(org.example.Company actual) {
    return new org.example.CompanyAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link org.example.EmployeeAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static org.example.EmployeeAssert then(org.example.Employee actual) {
    return new org.example.EmployeeAssert(actual);
  }

  /**
   * Creates a new <code>{@link BddAssertions}</code>.
   */
  protected BddAssertions() {
    // empty
  }
}
