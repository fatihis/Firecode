package InheritenceTesting;

public class Human extends Enitity  implements ILiving, TwoFeet {
    int avg = avgMaxAge;

    public Human(String name) {
        super(name);
    }

    @Override
    public int getAge() {
        return avgMaxAge;
    }

    @Override
    public void fs() {
        System.out.println("hey");
    }
}


