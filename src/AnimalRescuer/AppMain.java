package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {
        Dog myObject = new Dog();
        myObject.setName("aa");
        myObject.setName("");
        myObject.setName("");

        System.out.println("Catelul meu se numeste "+ myObject.getName() + " ");

        myObject.eat();

        Dog myObject2 = new Dog();
        myObject2.setName("rex");



//        rex.eat();
//
//        rex.setName("T Rex");
//
//        Dog mySecondDog = new Dog();
//        mySecondDog.name = "Grivei";
//
//
//
//        System.out.println(rex.name);
//        System.out.println(mySecondDog.name);
//
//        Dog myThirdDog = new Dog();
//        myThirdDog.name = "Grivei";
//        System.out.println("Third dog name: " + myThirdDog.name);

        Vet myVet = new Vet();

        Cat lizzy = new Cat();
        lizzy.setAge(1);


    }


//    public static void main(String[] args) {
//       AppMain ap = new AppMain();
//       String x = ap.faCafea(3,4,1);
//        System.out.println(x);
//    }

    static int numele(){
        System.out.println("ceva");
        return 3;
    }

    static void metoda2(){
        System.out.println("altcev");
    }

    String faCafea(int tarie, int dulce, int lapte){
        return "Am facut o cafea de nivel " + tarie +" de puterncia," +
                "este nivel " + dulce + " de dulce, s-a pus nivel " + lapte + " lapte.";
    }


}
