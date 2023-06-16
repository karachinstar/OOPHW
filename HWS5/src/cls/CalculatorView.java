package cls;

import java.util.Scanner;

public class CalculatorView {
    Scanner sc = new Scanner(System.in);

    public Double getNum(){
        //TODO: добавить обработку ошибки
        System.out.print("Введите число: ");
        return sc.nextDouble();
    }

    public String getOperator(){
        System.out.print("Введите оператор (+, -, *, /, ^): ");
        return sc.nextLine();
    }

    public char getInputOperator() {
        System.out.print("Введите оператор (+, -, *, /, ^): ");
        return sc.next().charAt(0);
    }
    public void displayResult(double result) {
        System.out.println("Result: " + result);
    }
}
