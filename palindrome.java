import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int flag=0;
        System.out.println("enter the string :");
        String  str =sc.next();
        int l=str.length();
        // using while loop
        // while (num != 0) {
        //     int digit = num % 10;
        //     reversedNum = reversedNum * 10 + digit;
        //     num /= 10;
        // }
 
        
        for(int i=0;i<l/2;i++){
            if(str.charAt(i)!=str.charAt(l-i-1)){
                flag=1;
                break;

            }
        }

        if(flag==0){
            System.out.println("palindroome");

        } else{
            System.out.println("not palindrome");
        }

    
  
    }
}
