package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {
        Dog rex = new Dog();
        System.out.println(rex.name);
        rex.bark();
        rex.eat();

        rex.name = "T Rex";

        Dog mySecondDog = new Dog();
        mySecondDog.name = "Grivei";



        System.out.println(rex.name);
        System.out.println(mySecondDog.name);

        Dog myThirdDog = new Dog();
        myThirdDog.name = "Grivei";
        System.out.println("Third dog name: " + myThirdDog.name);

    }
}
