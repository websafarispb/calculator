package ru.stepev.calculator;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ru.stepev.calculator.config.CalculatorConfig;
import ru.stepev.calculator.utils.Calculator;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CalculatorConfig.class);
		
		Calculator calc = context.getBean(Calculator.class);
		Scanner scanner = context.getBean(Scanner.class);

		while (true) {
			String input = scanner.nextLine();
			String expression = input.replaceAll(" ", "");
			System.out.println(calc.calculation(expression));
		}
	}
}