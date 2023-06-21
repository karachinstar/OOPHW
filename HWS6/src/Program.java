package HWS6.src;


import HWS6.src.cls.CalculatorModel;
import HWS6.src.cls.CalculatorPresenter;
import HWS6.src.cls.CalculatorView;

public class Program {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор!");
        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        CalculatorPresenter presenter = new CalculatorPresenter(view, model);

        presenter.performCalculation();
    }
}