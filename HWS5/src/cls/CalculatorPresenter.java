package cls;

public class CalculatorPresenter {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorPresenter(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
    }

    public void performCalculation() {
        double number1 = view.getNum();
        model.setResult(number1);
        char operator = view.getInputOperator();
        double number = view.getNum();

        switch (operator) {
            case '^':
                model.pow(number);
                break;
            case '+':
                model.add(number);
                break;
            case '-':
                model.subs(number);
                break;
            case '*':
                model.mult(number);
                break;
            case '/':
                model.devision(number);
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        view.displayResult(model.getResult());
    }
}