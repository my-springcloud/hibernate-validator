/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.hibernate.validator.test.internal.cdi.methodvalidation.getter;

import javax.validation.constraints.NotNull;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;

/**
 * @author Hardy Ferentschik
 */
@ValidateOnExecution(type = ExecutableType.GETTER_METHODS)
public class OnlyGetterValidated {
	@NotNull
	public String foo() {
		return null;
	}

	@NotNull
	public String getFoo() {
		return null;
	}
}
