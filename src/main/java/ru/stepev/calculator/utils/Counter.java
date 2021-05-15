package ru.stepev.calculator.utils;

import org.springframework.stereotype.Component;

@Component
public class Counter {

	private Parser parser;

	public Counter(Parser parser) {
		this.parser = parser;
	}

	public String countArabic(String expression) {
		Integer answer = 0;
		if (expression.contains("+")) {
			Integer[] arg = parser.parseArabicExpression(expression, "\\+");
			answer = addition(arg[0], arg[1]);
		} else {
			if (expression.contains("-")) {
				Integer[] arg = parser.parseArabicExpression(expression, "\\-");
				answer = subtraction(arg[0], arg[1]);

			} else {
				if (expression.contains("*")) {
					Integer[] arg = parser.parseArabicExpression(expression, "\\*");
					answer = multiplication(arg[0], arg[1]);
				} else {
					if (expression.contains("/")) {
						Integer[] arg = parser.parseArabicExpression(expression, "\\/");
						answer = division(arg[0], arg[1]);
					}
				}
			}
		}
		return answer.toString();
	}

	public String countRoman(String expression) {
		Integer answer = 0;
		if (expression.contains("+")) {
			Integer[] arg = parser.parseRomanExpression(expression, "\\+");
			answer = addition(arg[0], arg[1]);
		} else {
			if (expression.contains("-")) {
				Integer[] arg = parser.parseRomanExpression(expression, "\\-");
				answer = subtraction(arg[0], arg[1]);

			} else {
				if (expression.contains("*")) {
					Integer[] arg = parser.parseRomanExpression(expression, "\\*");
					answer = multiplication(arg[0], arg[1]);
				} else {
					if (expression.contains("/")) {
						Integer[] arg = parser.parseRomanExpression(expression, "\\/");
						answer = division(arg[0], arg[1]);
					}
				}
			}
		}
		return parser.converToRoman(answer);
	}

	private int division(Integer a, Integer b) {
		return a / b;
	}

	private int multiplication(Integer a, Integer b) {
		return a * b;
	}

	private int subtraction(Integer a, Integer b) {
		return a - b;
	}

	private int addition(Integer a, Integer b) {
		return a + b;
	}
}
