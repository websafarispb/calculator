package ru.stepev.calculator.utils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CounterTest {

	@Mock
	private Convertor convertor;

	@Mock
	private Parser parser;

	@InjectMocks
	private Counter counter;

	@Test
	public void givenRomanExpression_whenCountRomanNumbers_thenGetCorrestAnswer() {
		String expectedAnswer = "II";
		when(parser.parseRomanExpression("I+I", "\\+")).thenReturn(new Integer[] { 1, 1 });
		when(parser.converToRoman(2)).thenReturn("II");

		String actualAnswer = counter.countRoman("I+I");

		assertThat(expectedAnswer).isEqualTo(actualAnswer);
		verify(parser, times(1)).converToRoman(2);
		verify(parser, times(1)).parseRomanExpression("I+I", "\\+");
	}
}
