/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.hibernate.validator.ap.testmodel;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import javax.validation.constraints.Future;
import javax.validation.constraints.Past;

/**
 * @author Khalid Alqinyah
 */
public class ModelWithJava8DateTime {
	@Past
	@Future
	public LocalDate localDate;

	@Past
	@Future
	public LocalDateTime localDateTime;

	@Past
	@Future
	public ZonedDateTime zonedDateTime;

	@Past
	@Future
	public Instant instant;

	@Past
	@Future
	public OffsetDateTime offsetDateTime;

	@Past
	@Future
	public Year year;

	@Past
	@Future
	public YearMonth yearMonth;
}
