package cls;

public class Cat extends Animal {
    private String name;
    private Integer age;

    public Cat() {
        name = "name";
        age = 0;
    }

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }


    @Override
    public void startSwim() {
        System.out.printf("Мяу, %s не умеет плавать\n", name);
    }

    @Override
    public void showAnimal() {
        System.out.println("Мяу! Меня зовут " + name + ". Мне " +
                age + " года(лет).");
    }

    @Override
    public void startFly() {
        System.out.printf("%s не умеет летать\n", name);
    }

    @Override
    public String setName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }

    @Override
    public Integer setAge() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAge'");
    }

}
