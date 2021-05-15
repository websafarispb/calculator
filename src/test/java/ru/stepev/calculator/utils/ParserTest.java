package ru.stepev.calculator.utils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ParserTest {
	
	@Mock
	private Convertor convertor;

	@InjectMocks
	private Parser parser;
	
	@Test
	public void givenArabicExpression_whenParseArabicExpression_thenGetIntegerArrayWithCorrectDate() {
		Integer [] expectedArgs = new Integer[] {1,1};
		
		Integer [] actualArgs = parser.parseArabicExpression("1+1", "\\+");
		
		assertThat(expectedArgs).isEqualTo(actualArgs);
	}
	
	@Test
	public void givenRomanExpression_whenParseRomanExpression_thenGetIntegerArrayWithCorrectDate() {
		Integer [] expectedArgs = new Integer[] {1,1};
		when(convertor.romanToArabic("I")).thenReturn(1);
		
		Integer [] actualArgs = parser.parseRomanExpression("I+I", "\\+");
		
		assertThat(expectedArgs).isEqualTo(actualArgs);
		verify(convertor, times(2)).romanToArabic("I");
	}
}
