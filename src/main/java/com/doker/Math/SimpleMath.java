package com.doker.Math;

public class SimpleMath {

	public Double sum(Double numberOne, Double numberTwo) {
		Double result = numberOne + numberTwo;
		return result;
	}

	public Double subtraction(Double numberOne, Double numberTwo) {
		Double result = numberOne - numberTwo;
		return result;
	}

	public Double multiplication(Double numberOne, Double numberTwo) {
		Double result = numberOne * numberTwo;
		return result;
	}

	public Double division(Double numberOne, Double numberTwo) {
		Double result = numberOne / numberTwo;
		return result;
	}

	public Double mean(Double numberOne, Double numberTwo) {
		Double result = numberOne + numberTwo / 2;
		return result;
	}

	public Double squareRoot( Double number) {
		Double result = Math.sqrt(number);
		return result;
	}

}
