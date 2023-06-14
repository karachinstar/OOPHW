import cls.Animal;
import cls.Cat;
import cls.Dog;
import cls.Duck;
import interf.ConvertAge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program{

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        Cat cat = new Cat("Tomas", 12);
        Cat cat2 = new Cat("Ger", 4);
        Dog dog = new Dog("Polo", 3);
        Duck duck = new Duck("Donald", 4);

        ConvertAge<Dog> myDogTransformer = doggy -> {
            if (doggy.getAge() == 1)
            return doggy.getAge() + 14;
            else if (doggy.getAge() == 2) {
                return doggy.getAge() + 14 + 8;
            }
            else{
                return ((doggy.getAge()-2)*4) + 15 + 9;
            }
        };
        ConvertAge<Cat> myCatTransformer = kitty -> {
            if (kitty.getAge() == 1)
                return kitty.getAge() + 9;
            else if (kitty.getAge() == 2) {
                return kitty.getAge() + 9 + 13;
            }
            else{
                return ((kitty.getAge()-2)*4) + 10 + 14;
            }
        };



        animals.add(cat);
        animals.add(dog);
        animals.add(duck);
        animals.add(cat2);

        for (Animal a:animals) {
            a.showAnimal();
            a.startSwim();
            a.startFly();
        }
        System.out.println("Созданный список животных:");
        for (Animal a : animals) {
            System.out.println("Имя: " + a.getName() + " - Возраст (человеческий): "
                    + a.getAge());
        }

        sortName(animals);
        sortAge(animals);

        System.out.println(dog.getName()+" - это собака. На собачье его возраст - "
                +myDogTransformer.apply(dog) + " года(лет)");
        System.out.println(cat.getName() + " - это собака. На собачье его возраст - "+myCatTransformer.apply(cat) + " года(лет)");
}

    private static void sortName(List<Animal> animals) {
        Comparator<Animal> nameComparator = Comparator.comparing(Animal::getName);
        Collections.sort(animals, nameComparator);
        System.out.println("Отсортированный список животных по алфавиту имён:");
        for (Animal a : animals) {
            System.out.println("Имя: " + a.getName() + " - Возраст (человеческий): "
                    + a.getAge());
        }
    }
    private static void sortAge(List<Animal> animals) {
        Comparator<Animal> ageComparator = Comparator.comparing(Animal::getAge);
        Collections.sort(animals, ageComparator);
        System.out.println("Отсортированный список животных по возрасту:");
        for (Animal a : animals) {
            System.out.println("Имя: " + a.getName() + " - Возраст (человеческий): "
                    + a.getAge());
        }
    }
}