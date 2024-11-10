import java.util.Scanner;

public class Hypo {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter the no a");
        double a = sc.nextDouble();

        System.out.println("enter the no b");
        double b = sc.nextDouble();

        double c =Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));


        System.out.println(c);

    }
}