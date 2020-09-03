public class Main {


    public static void main(String[] args) {


        int x = 2;
        x++; //x = x + 1;
        System.out.println("valoarea lui x: " + x);

        x--; // x = x - 1;
        System.out.println("valoarea lui x: " + x);

        x += 2; // x = x + 2;
        System.out.println("valoarea lui x: " + x);

        x -= 3; // x = x - 3;
        System.out.println("valoarea lui x: " + x);

        int modulo = x % 2;
        System.out.println("x modulo 2 = " + modulo);

        int a = 7;

        double y = x / a;

        double myDouble = 3.6D;
        float myFloat = 3;

        System.out.println("print my float " + y);


        System.out.println();


        int dayOfMonth = 32;
        String mothOfYear = "august";
        int year = 2020;
        String nameOfTrainer = "Sebi";
        String lecture = "Metode";


        System.out.println(mothOfYear + (dayOfMonth + year));

        System.out.println("Astazi, " + dayOfMonth + " " + mothOfYear + " " + year + ",\n" +
                nameOfTrainer + " ne invata " + lecture + ".");

        lecture = "Bucle";

        System.out.println("Pe langa " + lecture + ", " + nameOfTrainer +
                " ne mai invata astazi, " + dayOfMonth + " " + mothOfYear + ", si sa " +
                "afisam in consola. Totodata, " + nameOfTrainer + " ne mai invata" +
                "sa folosim si variabile.");


    }


}



