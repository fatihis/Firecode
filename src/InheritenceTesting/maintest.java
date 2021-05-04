package InheritenceTesting;

public class maintest {
    public static void main(String[] args) {
        Human ne = new Human("name");
        System.out.println(ne.getAge()+ne.avg+ne.name);
        ne.fs();
    }
}
