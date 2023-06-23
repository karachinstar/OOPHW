package cls;

import cls.model.additionModel;

import java.io.FileWriter;

import static cls.CalculatorView.zn;

public class CalculatorPresenter {
    private additionModel add;
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorPresenter(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
        this.add = add;
    }

    public void performCalculation() {
        StringBuilder newTask = new StringBuilder();
        boolean n = false;
        while(n == false) {
            double number1 = view.getNum();
            double number2 = view.getNum();
            double number3;
            double number4;
            //model.setResult(number1);

            char operator = view.getInputOperator();
            double number = 0;


            switch (operator) {
                case 's':
                    n = true;
                    break;
//                case '!':
//                    newTask.append(model.getResult());
//                    model.fact(model.getResult());
//                    newTask.append(operator).append("=").append(model.getResult()).append("\n");
//                    break;
//                case '^':
//                    newTask.append(model.getResult());
//                    number = view.getNum();
//                    model.pow(number);
//                    newTask.append(operator).append(number).append("=").append(model.getResult()).append("\n");
//                    break;
                case '+':
                    newTask.append("(").append(number1).append(zn(number2)).append(number2).append("i").append(")");
                    number3 = view.getNum();
                    number4 = view.getNum();
                    add.addition(number1,number2,number3,number4);
                    newTask.append(operator).append("(").append(number3).append(zn(number4)).append(number4).append("i")
                            .append(")").append("=").append(add.getResult()).append("\n");
                    break;
                case '-':
                    newTask.append("(").append(number1).append(zn(number2)).append(number2).append("i").append(")");
                    number3 = view.getNum();
                    number4 = view.getNum();
                    model.subs(number1,number2,number3,number4);
                    newTask.append(operator).append("(").append(number3).append(zn(number4)).append(number4).append("i")
                            .append(")").append("=").append(model.getResult()).append("\n");
                    break;
                case '*':
                    newTask.append("(").append(number1).append(zn(number2)).append(number2).append("i").append(")");
                    number3 = view.getNum();
                    number4 = view.getNum();
                    model.mult(number1,number2,number3,number4);
                    newTask.append(operator).append("(").append(number3).append(zn(number4)).append(number4).append("i")
                            .append(")").append("=").append(model.getResult()).append("\n");
                    break;
                case '/':
                    newTask.append("(").append(number1).append(zn(number2)).append(number2).append("i").append(")");
                    number3 = view.getNum();
                    number4 = view.getNum();
                    model.division(number1,number2,number3,number4);
                    newTask.append(operator).append("(").append(number3).append(zn(number4)).append(number4).append("i")
                            .append(")").append("=").append(model.getResult()).append("\n");
                    break;
                default:
                    System.out.println("Invalid operator");
            }
            view.displayResult(model.getResult());


            view.recordLog(newTask);


        }

    }


}