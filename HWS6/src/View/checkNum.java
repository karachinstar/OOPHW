package View;

import java.util.Scanner;

public class checkNum implements number{
    @Override
    public Double getNum() {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Введите число: ");
        while(sc.hasNextDouble() != true){
            System.out.println("Вы ввели не число");
            System.out.print("Введите число: ");
            sc = new Scanner(System.in);
        }
        return sc.nextDouble();
    }
}

