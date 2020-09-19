package AnimalRescuer;

public class Dog extends Animal{

    private float fangsDimensions;

    public void run(){
        System.out.println("Running...");
    }

    public void bark(){
        System.out.println("Barking...");
    }


    public float getFangsDimensions() {
        return fangsDimensions;
    }

    public void setFangsDimensions(float fangsDimensions) {
        this.fangsDimensions = fangsDimensions;
    }
}
