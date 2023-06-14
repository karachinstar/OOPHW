import cls.Animal;
import cls.Cat;
import cls.Dog;
import cls.Duck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Program{

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Cat cat = new Cat("Tomas", 12);
        Dog dog = new Dog("Polo", 3);
        Duck duck = new Duck("Donald", 4);

        animals.add(cat);
        animals.add(dog);
        animals.add(duck);

        for (Animal a:animals) {
            a.showAnimal();
            a.startSwim();
            a.startFly();
        }
        System.out.println("Созданный список животных:");
        for (Animal a : animals) {
            System.out.println(a.getName() + " - " + a.getAge());
        }

        sortName(animals);
        sortAge(animals);

        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()) {
            Animal element = iterator.next();
            System.out.print(element + " ");

        
    }
}

    private static void sortName(List<Animal> animals) {
        Comparator<Animal> nameComparator = Comparator.comparing(Animal::getName);
        Collections.sort(animals, nameComparator);
        System.out.println("Отсортированный список животных по алфавиту имён:");
        for (Animal a : animals) {
            System.out.println(a.getName() + " - " + a.getAge());
        }
    }
    private static void sortAge(List<Animal> animals) {
        Comparator<Animal> ageComparator = Comparator.comparing(Animal::getAge);
        Collections.sort(animals, ageComparator);
        System.out.println("Отсортированный список животных по возрасту:");
        for (Animal a : animals) {
            System.out.println(a.getName() + " - " + a.getAge());
        }
    }
}