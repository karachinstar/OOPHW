package HWS1.task1;
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tomas", 12);
        Cat cat2 = new Owner("Polo", 13, "Igor");

        cat1.show_cat();
        cat2.show_cat();
    }
}
