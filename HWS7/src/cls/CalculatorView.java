package cls;

import java.io.FileWriter;
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



    public char getInputOperator() {
        System.out.print("Введите оператор ( + (сложение), - (вычитание), * (умножение),\n" +
                " / (деление), ^ (возведение в степень), ! (факториал) или букву s для выхода): ");
        return sc.next().charAt(0);
    }
    public void displayResult(String result) {
        System.out.println("Result: " + result);
    }

    public static String zn(double n){
        String t;
        if(n>=0) t = "+";
        else t = "";
        return t;
    }

    public void recordLog(StringBuilder newTask) {
        try {
            FileWriter fw = new FileWriter("log_task3.txt", true);
            fw.write(newTask.toString());
            fw.close();
            newTask.setLength(0);
        } catch (Exception e) {
            System.out.println("ERROR!");
        }
    }
}
