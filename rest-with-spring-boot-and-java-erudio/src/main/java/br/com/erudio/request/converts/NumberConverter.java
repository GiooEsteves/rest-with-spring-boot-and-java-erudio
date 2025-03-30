package br.com.erudio.request.converts;

import br.com.erudio.exceptions.UnsupportedMathOperationsException;

public class NumberConverter {
    public static Double convertToDouble(String strNumber) throws Exception{
        if(strNumber == null || strNumber.isEmpty()) throw new UnsupportedMathOperationsException("Please set a numeric value.");
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String strNumber){
        if(strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
