package com.java8.junit.tdd;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.java8.stream.demo.DateFormatTest;

class DateTestcase {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail(Messages.getString("DateTestcase.0")); //$NON-NLS-1$
	}

	@Test
	void testDateFormat() {
		assertThrows(java.time.DateTimeException.class, () -> {
			DateFormatTest.testDateFormat();
		});
	}

}
