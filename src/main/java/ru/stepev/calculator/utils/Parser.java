package ru.stepev.calculator.utils;

import org.springframework.stereotype.Component;

@Component
public class Parser {

	public Convertor convertor;
	
	public Parser(Convertor convertor) {
		this.convertor = convertor;
	}

	public Integer[] parseArabicExpression(String expression, String regex) {
		String[] args = expression.split(regex);
		return new Integer[] { Integer.parseInt(args[0]), Integer.parseInt(args[1]) };
	}

	public Integer[] parseRomanExpression(String expression, String regex) {
		String[] args = expression.split(regex);
		return new Integer[] { convertor.romanToArabic(args[0]), convertor.romanToArabic(args[1]) };
	}

	public String converToRoman(Integer answer) {
		return convertor.arabicToRoman(answer);
	}
}
