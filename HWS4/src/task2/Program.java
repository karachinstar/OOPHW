package task2;

public class Program {
    public static void main(String[] args) {
        PrintArray pA = new PrintArray();
        String[] arr1 = {"Apple", "Bread", "Book", "Table"};
        Integer[] arr2 = {1, 2, 6, 2, 7, 5};
        pA.<String>print(arr1);
        System.out.println();
        pA.<Integer>print(arr2);
    }
}
