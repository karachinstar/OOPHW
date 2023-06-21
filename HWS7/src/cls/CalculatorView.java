package cls;

import java.util.Scanner;

public class CalculatorView {
    Scanner sc = new Scanner(System.in);

    public Double getNum() {
        System.out.print("Введите число: ");
        while(sc.hasNextDouble() != true){
            System.out.println("Вы ввели не число");
            System.out.print("Введите число: ");
            sc = new Scanner(System.in);
        }
        return sc.nextDouble();
    }

//    public String getOperator(){
//        System.out.print("Введите оператор ( + (сложение), - (вычитание), * (умножение),\n" +
//                " / (деление), ^ (возведение в степень), ! (факториал) или букву s для выхода): ");
//        return sc.nextLine();
//    }

    public char getInputOperator() {
        System.out.print("Введите оператор ( + (сложение), - (вычитание), * (умножение),\n" +
                " / (деление), ^ (возведение в степень), ! (факториал) или букву s для выхода): ");
        return sc.next().charAt(0);
    }
    public void displayResult(double result) {
        System.out.println("Result: " + result + sc.next().charAt(0) + sc.nextDouble() + " = " + result);
    }
}
