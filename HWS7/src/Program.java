import cls.CalculatorModel;
import cls.CalculatorPresenter;
import cls.CalculatorView;

public class Program {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор!");
        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        CalculatorPresenter presenter = new CalculatorPresenter(view, model);

        presenter.performCalculation();
    }
}