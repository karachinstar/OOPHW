package cls;

import interf.Swimmable;

public class Dog extends Animal {
    private String name;
    private Integer age;


    public Dog(){
        name = "name";
        age = 0;
    }

    public Dog(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    void setName(String name){
        this.name = name;
    }

    void setAge(Integer age){
        this.age = age;
    }

    String getName(){
        return name;
    }

    Integer getAge(){
        return age;
    }

    @Override
    public void startSwim() {
        System.out.printf("%s плывет, погрузившись в воду\n", name);
    }
    @Override
    public void showAnimal(){
        System.out.println("Гав! Меня зовут " + name + ". Мне " +
                age + " года(лет).");
    }
    @Override
    public void startFly() {
        System.out.printf("%s не умеет летать\n", name);
    }
}
