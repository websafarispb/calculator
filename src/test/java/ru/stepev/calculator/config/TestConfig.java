package ru.stepev.calculator.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(CalculatorConfig.class)
public class TestConfig {

}
