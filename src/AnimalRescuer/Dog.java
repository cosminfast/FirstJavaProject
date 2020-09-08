package AnimalRescuer;

public class Dog {

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



    public void run(){
        System.out.println("Running...");
    }

    public void eat(){
        System.out.println("Eating...");
    }

    public void bark(){
        System.out.println("Barking...");
    }

    public void sleep(){
        System.out.println("Sleeping...");
    }

}
