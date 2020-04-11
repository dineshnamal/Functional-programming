package com.example.fp;

import java.util.List;

public class Ex01MethodReference {
	public static void main(String[] args) {
		printAllNumbersInListFunctional(List.of(1, 22, 14, 15, 7, 66));

	}

	private static void print(int number) {
		System.out.println(number);
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream() // Convert numbers into Stream of elements
		.forEach(Ex01MethodReference::print);//For each element in the stream calling print method in the current class
	}

}
