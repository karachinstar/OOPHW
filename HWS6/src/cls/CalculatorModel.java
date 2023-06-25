package cls;

import View.checkNum;

public class CalculatorModel {
    private double result;

    public void add(double number){
        result += number;
    }
    public void subs(double number){
        result -= number;
    }
    public void mult(double number){
        result *= number;
    }
    public void division(double number){
        checkNum localNumber = new checkNum();
        while (number ==0){
            System.out.println("Cannot divide by zero, please enter another number");
            number = localNumber.getNum();
        }
            result /= number;
    }

    public void pow(double number){result = (Math.pow(result, number));
    }
    public void fact(double number){
        number = 1;
        for (int i = 1; i <= result; i++) {
            number *= i;
        }
        result = number;
    }
    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
