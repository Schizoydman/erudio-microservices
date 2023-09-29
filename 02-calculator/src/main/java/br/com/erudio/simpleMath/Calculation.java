package br.com.erudio.simpleMath;

public class Calculation {

	public Double sum(Double numberOne, Double numberTwo) {
		Double sum = numberOne + numberTwo;
		return sum; 
	}
	
	public Double subtraction(Double numberOne, Double numberTwo) {
		Double subtraction = numberOne - numberTwo;
		return subtraction; 
	}
	
	public Double multiplication(Double numberOne, Double numberTwo) {
		Double multiplication = numberOne * numberTwo;
		return multiplication; 
	}
	
	public Double division(Double numberOne, Double numberTwo) {
		Double division = numberOne / numberTwo;
		return division; 
	}

	public Double square(Double numberOne) {
		Double square = (Double) Math.sqrt(numberOne);
		return square; 
	}
	
	public Double average(Double numberOne, Double numberTwo) {
		Double average = (numberOne + numberTwo)/2;
		return average; 
	}
}
