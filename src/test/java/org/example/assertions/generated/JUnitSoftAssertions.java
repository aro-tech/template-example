package org.example.assertions.generated;

import org.assertj.core.internal.cglib.proxy.Enhancer;

import org.assertj.core.api.ErrorCollector;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.Statement;

/**
 * Entry point for assertions of different data types. Each method in this class is a static factory for the
 * type-specific assertion objects.
 */
public class JUnitSoftAssertions implements TestRule {

  /** Collects error messages of all AssertionErrors thrown by the proxied method. */
  protected final ErrorCollector collector = new ErrorCollector();

  /** Creates a new </code>{@link JUnitSoftAssertions}</code>. */
  public JUnitSoftAssertions() {
    super();
  }

  /**
   * TestRule implementation that verifies that no proxied assertion methods have failed.
   */
  public Statement apply(final Statement base, Description description) {
    return new Statement() {
      @Override
      public void evaluate() throws Throwable {
        base.evaluate();
        MultipleFailureException.assertEmpty(collector.errors());
      }
    };
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
