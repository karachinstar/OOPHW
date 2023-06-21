package HWS6.src.cls;

public class CalculatorPresenter {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorPresenter(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
    }

    public void performCalculation() {
        boolean n = false;
        double number1 = view.getNum();
        model.setResult(number1);
        while(n == false) {
            char operator = view.getInputOperator();
            double number = 0;


            switch (operator) {
                case 's':
                    n = true;
                    break;
                case '!':
                    model.fact(number1);
                    break;
                case '^':
                    number = view.getNum();
                    model.pow(number);
                    break;
                case '+':
                    number = view.getNum();
                    model.add(number);
                    break;
                case '-':
                    number = view.getNum();
                    model.subs(number);
                    break;
                case '*':
                    number = view.getNum();
                    model.mult(number);
                    break;
                case '/':
                    number = view.getNum();
                    model.division(number);
                    break;
                default:
                    System.out.println("Invalid operator");
            }

            view.displayResult(model.getResult());
        }
    }
}