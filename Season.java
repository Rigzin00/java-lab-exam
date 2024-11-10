import java.util.*;
public class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){

        System.out.println("enter the month(1-12)");
        int month=sc.nextInt();

        if(month==0 || month>12){
            System.out.println("invalid ");
            break;
        }

        if(month==1 || month==2 || month==12){
            System.out.println("winter");

        }else  if(month==3 || month==4 || month==5){
            System.out.println("spring");
            
        }else  if(month==6 || month==7 || month==8){
            System.out.println("summer");
            
        }else  if(month==9 || month==10 || month==11){
            System.out.println("Autumn");
            
        } else{
            System.out.println("BOGUS MONTH");
        }


                                                      
    }
    
}
}
