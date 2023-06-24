package cls;

import arhiv.CalculatorModel;
import cls.model.additionModel;
import cls.model.divisionModel;
import cls.model.multiplicationModel;
import cls.model.subtractionModel;

import java.io.IOException;

import static cls.CalculatorView.zn;

public class CalculatorPresenter{
    private divisionModel div;
    private multiplicationModel mult;
    private subtractionModel sub;
    private additionModel add;
    private CalculatorView view;


    public CalculatorPresenter(CalculatorView view, additionModel add,
                               subtractionModel sub, multiplicationModel mult,
                               divisionModel div) {
        this.view = view;
        this.add = add;
        this.sub = sub;
        this.mult = mult;
        this.div = div;
    }

    public void performCalculation() throws IOException {
        StringBuilder newTask = new StringBuilder();
        boolean n = false;
        while(n == false) {
            System.out.println("Операции проводятся с комплексными числами вида a±bi");
            double number1;
            double number2;
            double number3;
            double number4;

            char operator = view.getInputOperator();


            switch (operator) {
                case 'h':
                    view.readLog();
                    break;
                case 's':
                    n = true;
                    break;
                case '+':
                    System.out.println("Первое комплексное число: ");
                    number1 = view.getNum1();
                    number2 = view.getNum2();
                    newTask.append("(").append(number1).append(zn(number2)).append(number2).append("i").append(")");
                    System.out.println("Второе комплексное число: ");
                    number3 = view.getNum1();
                    number4 = view.getNum2();
                    add.addition(number1,number2,number3,number4);
                    newTask.append(operator).append("(").append(number3).append(zn(number4)).append(number4).append("i")
                            .append(")").append("=").append(add.getResult()).append("\n");
                    view.displayResult(add.getResult());
                    break;
                case '-':
                    System.out.println("Первое комплексное число: ");
                    number1 = view.getNum1();
                    number2 = view.getNum2();
                    newTask.append("(").append(number1).append(zn(number2)).append(number2).append("i").append(")");
                    System.out.println("Второе комплексное число: ");
                    number3 = view.getNum1();
                    number4 = view.getNum2();
                    sub.substraction(number1,number2,number3,number4);
                    newTask.append(operator).append("(").append(number3).append(zn(number4)).append(number4).append("i")
                            .append(")").append("=").append(sub.getResult()).append("\n");
                    view.displayResult(sub.getResult());
                    break;
                case '*':
                    System.out.println("Первое комплексное число: ");
                    number1 = view.getNum1();
                    number2 = view.getNum2();
                    newTask.append("(").append(number1).append(zn(number2)).append(number2).append("i").append(")");
                    System.out.println("Второе комплексное число: ");
                    number3 = view.getNum1();
                    number4 = view.getNum2();
                    mult.multiplication(number1,number2,number3,number4);
                    newTask.append(operator).append("(").append(number3).append(zn(number4)).append(number4).append("i")
                            .append(")").append("=").append(mult.getResult()).append("\n");
                    view.displayResult(mult.getResult());
                    break;
                case '/':
                    System.out.println("Первое комплексное число: ");
                    number1 = view.getNum1();
                    number2 = view.getNum2();
                    newTask.append("(").append(number1).append(zn(number2)).append(number2).append("i").append(")");
                    System.out.println("Второе комплексное число: ");
                    number3 = view.getNum1();
                    number4 = view.getNum2();
                    div.division(number1,number2,number3,number4);
                    newTask.append(operator).append("(").append(number3).append(zn(number4)).append(number4).append("i")
                            .append(")").append("=").append(div.getResult()).append("\n");
                    view.displayResult(div.getResult());
                    break;
                default:
                    System.out.println("Invalid operator");
            }
            view.recordLog(newTask);


        }

    }


}