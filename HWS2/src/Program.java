import cls.Animal;
import cls.Cat;
import cls.Dog;
import cls.Duck;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Cat cat = new Cat("Tomas", 12);
        Dog dog = new Dog("Polo", 5);
        Duck duck = new Duck("Donald", 4);

        animals.add(cat);
        animals.add(dog);
        animals.add(duck);

        for (Animal a:animals) {
            a.showAnimal();
            a.startSwim();
            a.startFly();
        }
    }
}