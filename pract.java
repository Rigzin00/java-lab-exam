import java.util.*;
public class pract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("enter the no ");;
            int num =sc.nextInt();

            if(num==0){
                System.out.println("exiting..");
                break;
            }
            if(num%2==0){
                System.out.println("even");

            } else{
                System.out.println("odd");
            }


        }

    }
}
