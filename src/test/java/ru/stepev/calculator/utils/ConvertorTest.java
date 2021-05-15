package ru.stepev.calculator.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import ru.stepev.calculator.config.TestConfig;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TestConfig.class)
public class ConvertorTest {
	
	@Autowired
	private Convertor convertor;
	
	@Test
	public void givenArabicNumber_whenConvertToRoman_thenGetRomanNumber() {
		String expected = "IV";
		
		String actual = convertor.arabicToRoman(4);
		
		assertThat(expected).isEqualTo(actual);
	}
}
