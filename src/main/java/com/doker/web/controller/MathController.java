package com.doker.web.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.doker.Math.SimpleMath;
import com.doker.converte.NumberConverter;
import com.doker.exceptions.UnsuportedMathOperationException;


@RestController
public class MathController {
	
	private SimpleMath math = new SimpleMath();
	
	
    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
      
    	if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        Double result = math.sum(NumberConverter.covertToDouble(numberOne),
        						 NumberConverter.covertToDouble(numberTwo));
        return result;        
    }
    
    @RequestMapping(value="/subtraction/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        
    	if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        Double result = math.subtraction(NumberConverter.covertToDouble(numberOne),
        					        	NumberConverter.covertToDouble(numberTwo));
        return result;        
    }
    
    @RequestMapping(value="/multiplication/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        
    	if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        Double result = math.multiplication(NumberConverter.covertToDouble(numberOne),
        									NumberConverter.covertToDouble(numberTwo));
        return result;        
    }
    
    @RequestMapping(value="/division/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
       
    	if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        Double result = math.division(NumberConverter.covertToDouble(numberOne),
        							  NumberConverter.covertToDouble(numberTwo));
        return result;        
    }
    
    @RequestMapping(value="/mean/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
       
    	if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        Double result = math.mean(NumberConverter.covertToDouble(numberOne),
        						  NumberConverter.covertToDouble(numberTwo));
        return result;        
    }
    
    @RequestMapping(value="/squareRoot/{number}", method=RequestMethod.GET)
    public Double squareRoot(@PathVariable("number") String number) throws Exception {
       
    	if (!NumberConverter.isNumeric(number)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        Double result = Math.sqrt(NumberConverter.covertToDouble(number));
        return result;        
    }

}