package ru.stepev.calculator.config;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.stepev")
public class CalculatorConfig {

	@Bean
	public Scanner scanner() {
		return new Scanner(System.in);
	}
}
