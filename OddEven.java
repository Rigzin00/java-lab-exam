import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while(true){
        System.out.println("enter the no:");
        num =sc.nextInt();
        if (num == 0) {
            System.out.println("Exiting the program.");
            break;
        }

       
            if(num%2==0){
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }

        

    }
    
}
