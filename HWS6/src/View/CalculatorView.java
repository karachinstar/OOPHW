package View;

import java.util.Scanner;

public class CalculatorView {
    Scanner sc = new Scanner(System.in);


    public char getInputOperator() {
        System.out.print("Введите оператор ( + (сложение), - (вычитание), * (умножение),\n" +
                " / (деление), ^ (возведение в степень), ! (факториал) или букву s для выхода): ");
        return sc.next().charAt(0);
    }

    public char getInputOption(){
        System.out.print("Введите оператор r для совершения действия с получившимся результатом или t для нового действия ");
        return sc.next().charAt(0);
    }
    public void displayResult(double result) {
        System.out.println("Result: " + result);
    }
}
