package cls;

import java.io.*;
import java.util.Scanner;

public class CalculatorView {
    Scanner sc = new Scanner(System.in);

    public Double getNum1() {
        System.out.print("Введите вещественную часть комплексного числа - a: ");
        while(sc.hasNextDouble() != true){
            System.out.println("Вы ввели не число");
            System.out.print("Введите вещественную часть комплексного числа - a: ");
            sc = new Scanner(System.in);
        }
        return sc.nextDouble();
    }
    public Double getNum2() {
        System.out.print("Введите мнимую часть комплексного числа - b: ");
        while(sc.hasNextDouble() != true){
            System.out.println("Вы ввели не число");
            System.out.print("Введите мнимую часть комплексного числа - b: ");
            sc = new Scanner(System.in);
        }
        return sc.nextDouble();
    }




    public char getInputOperator() {
        System.out.print("Введите оператор ( + (сложение), - (вычитание), * (умножение),\n" +
                " / (деление), h для вызова истории операций или букву s для выхода): ");
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
            FileWriter fw = new FileWriter("log_calc.txt", true);
            fw.write(newTask.toString());
            fw.close();
            newTask.setLength(0);
        } catch (Exception e) {
            System.out.println("ERROR!");
        }
    }

    public void readLog() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("log_calc.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        while ((line = fin.readLine()) != null) System.out.println(line);
    }

}
