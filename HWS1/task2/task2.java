package HWS2;

public class task2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2, 4);
        System.out.println("Первый прямоугольник:");
        r1.show_rectangle();
        r1.calculateArea();
        r1.calculatePerimete();
        System.out.println("Второй прямоугольник:");
        r2.show_rectangle();
        r2.calculateArea();
        r2.calculatePerimete();
    }
    
}
