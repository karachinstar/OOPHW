package task1;

public class Program {
    public static void main(String[] args) {
        Gen <Integer> objectOne = new Gen<>(13);
        Gen <String> objectTwo = new Gen<>("Hello");
        Gen <Double> objectThree = new Gen<>(5.75);

        objectOne.swType();
        int v = objectOne.getObject();
        System.out.println("Значение v = "+ v);

        objectTwo.swType();
        String c = objectTwo.getObject();
        System.out.println("Значение v = "+ c);

        objectThree.swType();
         Double b = objectThree.getObject();
        System.out.println("Значение v = "+ b);
    }
}
