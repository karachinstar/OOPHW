package cls;

import interf.Fly;
import interf.Swimmable;
import interf.YearInMounth;
import interf.showAnimals;

public abstract class Animal implements Swimmable, showAnimals, Fly, YearInMounth<Integer> {
    public abstract String getName();
    public abstract String setName();
    public abstract Integer getAge();
    public abstract Integer setAge();
}
