package task1;

public class Gen <T>{
    T object;
    Gen (T o){
        object = o;
    }
    T getObject(){
        return object;
    }
    void swType(){
        System.out.println("Тип Т - это " + object.getClass().getName());
    }
}
