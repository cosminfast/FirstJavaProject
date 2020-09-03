public class Lab2 {

    static double memberVariable;

    public static void main(String[] args) {
        System.out.println("The sum is: " + sum(3, 5));

        memberVariable = sum(7,8);
        System.out.println(memberVariable);

    }

    static double sum(double first, double second) {
        double result = first + second;
        return result;
    }

    static double substract(double first, double second) {
        double result = first - second;
        return result;
    }

}
