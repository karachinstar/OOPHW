package HWS1.task1;
public class Owner extends Cat{
    String owner;

    public Owner(){
        super();
        owner = "none";
    }

    public Owner(String name, Integer age, String owner){
        super(name, age);
        this.owner = owner;
    }

    @Override
    void show_cat(){
        System.out.println("Мяу! Меня зовут " + getName() + ". Мне " +
        getAge() + " года(лет)." + " Мой владелец - " + owner + ".");
    }
}
