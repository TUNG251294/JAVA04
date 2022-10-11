import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter argument a of quadratic equation: ");
        a = scanner.nextDouble();
        System.out.println("Enter argument b of quadratic equation: ");
        b = scanner.nextDouble();
        System.out.println("Enter argument c of quadratic equation: ");
        c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        if(equation.getDelta() < 0){
            System.out.println("The equation has no roots");
        } else if (equation.getDelta() == 0){
            System.out.println("The equation has one root: " + equation.getRoot1());
        } else {
            System.out.println("The equation has two roots r1 = " + equation.getRoot1() + " ,r2 = " + equation.getRoot2());
        }
    }
}