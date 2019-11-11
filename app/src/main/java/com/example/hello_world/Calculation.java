package com.example.hello_world;

import android.view.View;

import androidx.annotation.NonNull;

public class Calculation {
    private Integer operator;  // 1 für +, 2 für -, 3 für * und 4 für /
    private Double number1;
    private Double number2;
    private Double result;

    public Calculation(Double number1, Double number2, Integer operator){
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
        this.calculate();
    }

    public Calculation(Double number1, Double number2, Integer operator, Double result){
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
        this.result = result;
    }


    public Integer getOperator(){
        return this.operator;
    }

    public void setOperator(Integer op){
        this.operator = op;
    }

    public Double getNumber1() {
        return this.number1;
    }

    public void setNumber1(Double number1) {
        this.number1 = number1;
    }

    public Double getNumber2() {
        return this.number2;
    }

    public void setNumber2(Double number2) {
        this.number2 = number2;
    }

    public Double getResult() {
        return this.result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public void calculate(){
        switch(operator){
            case 1:
                result = number1 + number2;
                break;
            case 2:
                result = number1 - number2;
                break;
            case 3:
                result = number1 * number2;
                break;
            case 4:
                result = number1 / number2;
                break;
        }
    }

    public String toString() {
        String calculation;
        calculation = number1.toString() + " " + operator.toString() + " " + number2.toString() + " = " + result.toString();

    }

    private String operatorToString(){
        switch (operator){
            case 1:
                return "+";
            case 2:
                return "-";
            case 3:
                return "*";
            case 4:
                return "/";
            default:
                return "";
        }
    }
}
