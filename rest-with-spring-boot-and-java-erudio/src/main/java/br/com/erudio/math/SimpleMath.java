package br.com.erudio.math;

public class SimpleMath {
    public static Double sum(Double numberOne, Double numberTwo){
        return numberOne + numberTwo;
    }

    public static Double subtraction(Double numberOne, Double numberTwo){
        return numberOne - numberTwo;
    }

    public static Double multiplication(Double numberOne, Double numberTwo){
        return numberOne * numberTwo;
    }

    public static Double division(Double numberOne, Double numberTwo){
        return numberOne / numberTwo;
    }

    public static Double avg(Double numberOne, Double numberTwo){
        return (numberOne + numberTwo)/2;
    }

    public static Double squareroot(Double numberOne){
        return Math.sqrt(numberOne);
    }
}
