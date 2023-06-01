package HWS1.task1;
/**
 * Cat
 */
public class Cat {

    private String name;
    private Integer age;
    private Owner owner;

    public Cat(){
        name = "name";
        age = 0;
    }

    public Cat(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    void show_cat(){
        System.out.println("Мяу! Меня зовут " + name + ". Мне " +
        age + " года(лет).");
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
    
    public Owner setOwner(Owner owner){
        return owner;
    }

    public Owner getOwner(){
        return owner;
    }

}