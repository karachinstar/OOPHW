import cls.CalculatorPresenter;
import cls.CalculatorView;
import cls.model.additionModel;
import cls.model.divisionModel;
import cls.model.multiplicationModel;
import cls.model.subtractionModel;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        System.out.println("Добро пожаловать в калькулятор комплексных чисел!");
        CalculatorView view = new CalculatorView();
        additionModel add = new additionModel();
        subtractionModel sub = new subtractionModel();
        multiplicationModel mult = new multiplicationModel();
        divisionModel div = new divisionModel();
        CalculatorPresenter presenter = new CalculatorPresenter(view, add, sub, mult, div);

        presenter.performCalculation();
    }
}