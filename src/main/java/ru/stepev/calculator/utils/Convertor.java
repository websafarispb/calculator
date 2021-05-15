package ru.stepev.calculator.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Convertor {
	
	private Map<String, Integer> romanUnitsOppositeArabic = new HashMap<>();
	private Map<Integer, String> arabicUnitsOppositeRoman = new HashMap<>();
	private Map<Integer, String> arabicDecimalOppositeRoman = new HashMap<>();

	public Convertor() {
		romanUnitsOppositeArabic.put("I", 1);
		romanUnitsOppositeArabic.put("II", 2);
		romanUnitsOppositeArabic.put("III", 3);
		romanUnitsOppositeArabic.put("IV", 4);
		romanUnitsOppositeArabic.put("V", 5);
		romanUnitsOppositeArabic.put("VI", 6);
		romanUnitsOppositeArabic.put("VII", 7);
		romanUnitsOppositeArabic.put("VIII", 8);
		romanUnitsOppositeArabic.put("IX", 9);
		romanUnitsOppositeArabic.put("X", 10);
		
		arabicUnitsOppositeRoman.put(0, "");
		arabicUnitsOppositeRoman.put(1, "I");
		arabicUnitsOppositeRoman.put(2, "II");
		arabicUnitsOppositeRoman.put(3, "III");
		arabicUnitsOppositeRoman.put(4, "IV");
		arabicUnitsOppositeRoman.put(5, "V");
		arabicUnitsOppositeRoman.put(6, "VI");
		arabicUnitsOppositeRoman.put(7, "VII");
		arabicUnitsOppositeRoman.put(8, "VIII");
		arabicUnitsOppositeRoman.put(9, "IX");
		arabicUnitsOppositeRoman.put(10, "X");
	
		arabicDecimalOppositeRoman.put(0, "");
		arabicDecimalOppositeRoman.put(1, "X");
		arabicDecimalOppositeRoman.put(2, "XX");
		arabicDecimalOppositeRoman.put(3, "XXX");
		arabicDecimalOppositeRoman.put(4, "XL");
		arabicDecimalOppositeRoman.put(5, "L");
		arabicDecimalOppositeRoman.put(6, "LX");
		arabicDecimalOppositeRoman.put(7, "LXX");
		arabicDecimalOppositeRoman.put(8, "LXXX");
		arabicDecimalOppositeRoman.put(9, "XC");
		arabicDecimalOppositeRoman.put(10, "C");
	}
	
	public int romanToArabic (String number) {
		return romanUnitsOppositeArabic.get(number);
	}
	
	public String arabicToRoman(Integer number) {
		Integer decimal = number / 10;
		Integer unit = number % 10;
		StringBuilder convertedNumber = new StringBuilder();
		convertedNumber.append(arabicDecimalOppositeRoman.get(decimal));
		convertedNumber.append(arabicUnitsOppositeRoman.get(unit));
		return convertedNumber.toString();
	}
}
