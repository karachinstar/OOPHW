package task2;

public class PrintArray {
    public <T> void print(T[] items) {
        for (T item : items) {
            System.out.print(item + " ");
        }
    }
}
