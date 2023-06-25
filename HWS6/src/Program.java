import View.checkNum;
import cls.CalculatorModel;
import cls.CalculatorPresenter;
import View.CalculatorView;

public class Program {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор!");
        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        checkNum num = new checkNum();
        CalculatorPresenter presenter = new CalculatorPresenter(view, model, num);

        presenter.performCalculation();
    }
}