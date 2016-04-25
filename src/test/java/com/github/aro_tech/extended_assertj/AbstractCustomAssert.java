/**
 * 
 */
package com.github.aro_tech.extended_assertj;

import org.assertj.core.api.AbstractAssert;

/**
 * @author aro_tech
 *
 */
public class AbstractCustomAssert<S extends AbstractAssert<S, A>, A> extends AbstractAssert<S, A> {

	protected AbstractCustomAssert(A actual, Class<?> selfType) {
		super(actual, selfType);
	}
}
