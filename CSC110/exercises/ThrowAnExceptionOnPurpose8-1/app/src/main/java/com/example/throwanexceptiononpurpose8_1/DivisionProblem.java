package com.example.throwanexceptiononpurpose8_1;

public class DivisionProblem {
    private double dividend = 0.0;
    private double divisor = 1.0;
    private double result = 0.0;

    public void calculateResult(){
        result = getDividend() / getDivisor();
    }

    void setDivisorFromString(String d) throws IllegalAccessException {
        double div = Double.parseDouble(d);
        setDivisor(div);
    }
    void setDividendFromString(String d){
        setDividend(Double.parseDouble(d));
    }



    public double getDividend() {
        return dividend;
    }

    public void setDividend(double dividend) throws NumberFormatException {
        this.dividend = dividend;
    }

    public double getDivisor() {
        return divisor;
    }

    public void setDivisor(double divisor) throws IllegalAccessException, NumberFormatException {
        if(divisor == 0){
            throw new IllegalAccessException("The divisor cannot be 0");
        }
        this.divisor = divisor;
    }

    public double getResult() {
        return result;
    }
}
