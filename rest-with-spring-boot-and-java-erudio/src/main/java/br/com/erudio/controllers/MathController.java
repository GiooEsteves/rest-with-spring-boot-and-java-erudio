package br.com.erudio.controllers;

import br.com.erudio.exceptions.UnsupportedMathOperationsException;
import br.com.erudio.math.SimpleMath;
import br.com.erudio.request.converts.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception{
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
            throw new UnsupportedMathOperationsException("Please set a numeric value.");
        return SimpleMath.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
            throw new UnsupportedMathOperationsException("Please set a numeric value.");
        return SimpleMath.subtraction(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping("/mult/{numberOne}/{numberTwo}")
    public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
            throw new UnsupportedMathOperationsException("Please set a numeric value.");
        return SimpleMath.multiplication(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping("/div/{numberOne}/{numberTwo}")
    public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
            throw new UnsupportedMathOperationsException("Please set a numeric value.");
        if (numberTwo.equals("0")) throw new UnsupportedMathOperationsException("Please, number two can't be 0");

        return SimpleMath.division(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping("/avg/{numberOne}/{numberTwo}")
    public Double avg(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
            throw new UnsupportedMathOperationsException("Please set a numeric value.");
        return SimpleMath.avg(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping("/square/{numberOne}")
    public Double square(@PathVariable("numberOne") String numberOne) throws Exception {
        if (!NumberConverter.isNumeric(numberOne)) throw new UnsupportedMathOperationsException("Please set a numeric value.");
        return SimpleMath.squareroot(NumberConverter.convertToDouble(numberOne));
    }
}
