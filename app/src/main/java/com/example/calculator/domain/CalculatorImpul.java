package com.example.calculator.domain;

public class CalculatorImpul implements Calculator {
    @Override
    public double binoperation(double argOne, double argTwo, Operation operation) {
        switch (operation) {
            case ADD:
                return argOne + argTwo;
            case SUB:
                return argOne - argTwo;
            case MULT:
                return argOne * argTwo;
            case DIV:
                return argOne / argTwo;
        }
        return 0;
    }
}
