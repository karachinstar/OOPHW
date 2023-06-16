package task3;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        getMax<Integer> num1 = new getMax<Integer>(10);
        getMax<Integer> num2 = new getMax<Integer>(15);


        getMax<Double> num3 = new getMax<Double>(10.45);
        getMax<Double> num4 = new getMax<Double>(11.68);

        Comparator<getMax<Integer>> comporator1 = (o1, o2) -> o1.getValue().compareTo(o2.getValue());
        Comparator<getMax<Double>> comporator2 = (o1, o2) -> o1.getValue().compareTo(o2.getValue());

        int res = comporator1.compare(num1, num2);
        if (res == -1){
            res = num2.getValue();
        }
        else res = num1.getValue();
        System.out.println("Максимальное значение целых чисел= " + res);

        Double res2 = (double) comporator2.compare(num3, num4);
        if (res2 == -1){
            res2 = num4.getValue();
        }
        else res2 = num3.getValue();
        System.out.println("Максимальное значение дробных чисел= " + res2);
    }
    
}
