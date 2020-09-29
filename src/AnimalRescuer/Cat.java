package AnimalRescuer;

public abstract class Cat extends Animal{

    public void purr(){
        System.out.println("purrr.rr.rrrr.rr");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void run() {
        System.out.println("running");

    }
}
