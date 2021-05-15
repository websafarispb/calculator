package ru.stepev.calculator.utils;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import ru.stepev.calculator.config.TestConfig;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TestConfig.class)
public class CalculatorTest {

	@Autowired
	private Calculator calculator;

	@Test
	public void someTest() {
		
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			calculator.calculation("I + 1");
		});

		String expectedMessage = "Incorrect date";
		String actualMessage = exception.getMessage();
		assertTrue(actualMessage.contains(expectedMessage));
	}
}
