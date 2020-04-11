package com.example.fp;

import java.util.List;

/**
 * Print Even numbers
 * @author Namal
 *
 */

public class Ex02MethodReference {
	public static void main(String[] args) {
		printAllNumbersInListFunctional(List.of(1, 22, 14, 15, 7, 66));

	}



	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream() // Convert numbers into Stream of elements
		.filter(s->s%2 == 0)
		.forEach(System.out::println);//This is improvement of Ex01 MethodReference not using print method
	}

}
