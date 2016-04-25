package org.example.assertions.generated;

import static org.assertj.core.groups.Properties.extractProperty;

import java.util.List;
import org.assertj.core.internal.cglib.proxy.Enhancer;

import org.assertj.core.api.ErrorCollector;
import org.assertj.core.api.SoftAssertionError;

/**
 * Entry point for assertions of different data types. Each method in this class is a static factory for the
 * type-specific assertion objects.
 */
public class SoftAssertions {

  /** Collects error messages of all AssertionErrors thrown by the proxied method. */
  protected final ErrorCollector collector = new ErrorCollector();

  /** Creates a new </code>{@link SoftAssertions}</code>. */
  public SoftAssertions() {
  }

  /**
   * Verifies that no proxied assertion methods have failed.
   *
   * @throws SoftAssertionError if any proxied assertion objects threw
   */
  public void assertAll() {
    List<Throwable> errors = collector.errors();
    if (!errors.isEmpty()) {
      throw new SoftAssertionError(extractProperty("message", String.class).from(errors));
    }
  }

  @SuppressWarnings("unchecked")
  protected <T, V> V proxy(Class<V> assertClass, Class<T> actualClass, T actual) {
    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(assertClass);
    enhancer.setCallback(collector);
    return (V) enhancer.create(new Class[] { actualClass }, new Object[] { actual });
  }

  /**
   * Creates a new "soft" instance of <code>{@link org.example.AddressAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created "soft" assertion object.
   */
  public org.example.AddressAssert assertThat(org.example.Address actual) {
    return proxy(org.example.AddressAssert.class, org.example.Address.class, actual);
  }

  /**
   * Creates a new "soft" instance of <code>{@link org.example.CompanyAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created "soft" assertion object.
   */
  public org.example.CompanyAssert assertThat(org.example.Company actual) {
    return proxy(org.example.CompanyAssert.class, org.example.Company.class, actual);
  }

  /**
   * Creates a new "soft" instance of <code>{@link org.example.EmployeeAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created "soft" assertion object.
   */
  public org.example.EmployeeAssert assertThat(org.example.Employee actual) {
    return proxy(org.example.EmployeeAssert.class, org.example.Employee.class, actual);
  }

}
