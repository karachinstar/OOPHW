package cls;

import View.CalculatorView;
import View.checkNum;

public class CalculatorPresenter {
    private CalculatorView view;
    private CalculatorModel model;
    private checkNum num;

    public CalculatorPresenter(CalculatorView view, CalculatorModel model, checkNum num) {
        this.view = view;
        this.model = model;
        this.num = num;
    }

    public void performCalculation() {
        boolean n = false;
        boolean t = false;
        double number1;
        while (!n) {
            if (!t) {
                number1 = num.getNum();
                model.setResult(number1);
            } else number1 = model.getResult();

            char operator = view.getInputOperator();
            double number = 0;

            switch (operator) {
                case 's' -> n = true;
                case '!' -> model.fact(number1);
                case '^' -> {
                    number = num.getNum();
                    model.pow(number);
                }
                case '+' -> {
                    number = num.getNum();
                    model.add(number);
                }
                case '-' -> {
                    number = num.getNum();
                    model.subs(number);
                }
                case '*' -> {
                    number = num.getNum();
                    model.mult(number);
                }
                case '/' -> {
                    number = num.getNum();
                    model.division(number);
                }
                default -> System.out.println("Invalid operator");
            }
            view.displayResult(model.getResult());
            char option = view.getInputOption();
            switch (option) {
                case 'r' -> t = true;
                case 't' -> t = false;
            }
        }
    }
}