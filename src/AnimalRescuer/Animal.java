package AnimalRescuer;

public abstract class Animal {

    private String name ;
    private String color ;
    private float age ;
    private float weight ;
    private String breed ;
    private boolean isMale ;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }


    public abstract void sleep();


    public abstract void eat();


    public abstract void run();
}
