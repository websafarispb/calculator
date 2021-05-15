package ru.stepev.calculator.utils;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

	public static final String ARABIC = "([1-9]||10)(\\-||\\+||\\*||\\/)([1-9]||10)";
	public static final String ROMAN = "(I|II|III|IV|V|VI|VII|VIII|IX|X)(\\-||\\+||\\*||\\/)(I|II|III|IV|V|VI|VII|VIII|IX|X)";

	public Counter counter;
	public String answer;

	public Calculator(Counter counter) {
		this.counter = counter;
		this.answer = null;
	}

	public String calculation(String expression) {

		if (expression.matches(ARABIC)) {
			answer = counter.countArabic(expression);
		} else {
			if (expression.matches(ROMAN)) {
				answer = counter.countRoman(expression);

			} else {
				throw new IllegalArgumentException("Incorrect date");
			}
		}
		return answer;
	}
}
