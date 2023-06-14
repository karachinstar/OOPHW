package cls;

public class Duck extends Animal{
    private String name;
    private Integer age;


    public Duck(){
        name = "name";
        age = 0;
    }

    public Duck(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    void setName(String name){
        this.name = name;
    }

    void setAge(Integer age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }

    @Override
    public void startSwim() {
        System.out.printf("%s плывет по поверхности воды\n", name);
    }

    @Override
    public void showAnimal() {
        System.out.println("Кря! Меня зовут " + name + ". Мне " +
                age + " года(лет).");
    }
    @Override
    public void startFly() {
        System.out.printf("%s улетает на юг\n", name);
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
