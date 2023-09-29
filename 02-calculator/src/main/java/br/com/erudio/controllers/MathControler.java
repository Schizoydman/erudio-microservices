package br.com.erudio.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.converter.Conversor;
import br.com.erudio.exception.UnsuportedMathOperationException;
import br.com.erudio.simpleMath.Calculation;

@RestController
public class MathControler extends Calculation{

	private Conversor c = new Conversor();
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!c.isNumeric(numberOne) || !c.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		Double sum = sum(c.convertToDouble(numberOne), c.convertToDouble(numberTwo));
		return sum;
	}

	@RequestMapping(value="/subtraction/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!c.isNumeric(numberOne) || !c.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		Double subtraction = subtraction(c.convertToDouble(numberOne), c.convertToDouble(numberTwo));
		return subtraction;
	}
	
	@RequestMapping(value="/multiplication/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!c.isNumeric(numberOne) || !c.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		Double multiplication = multiplication(c.convertToDouble(numberOne), c.convertToDouble(numberTwo));
		return multiplication;
	}
	
	@RequestMapping(value="/division/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!c.isNumeric(numberOne) || !c.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		Double division = division(c.convertToDouble(numberOne), c.convertToDouble(numberTwo));
		return division;
	}
	
	@RequestMapping(value="/square/{numberOne}", method=RequestMethod.GET)
	public Double square(@PathVariable("numberOne") String numberOne) throws Exception {
		if (!c.isNumeric(numberOne)) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		Double square = square(c.convertToDouble(numberOne));
		return square;
	}
	
	@RequestMapping(value="/average/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double average(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo ) throws Exception {
		if (!c.isNumeric(numberOne) || !c.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value");
		}
		Double average = average(c.convertToDouble(numberOne),c.convertToDouble(numberTwo));
		return average;
	}
}
