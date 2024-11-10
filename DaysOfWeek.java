import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){


        System.out.print("Enter a number (1-7) to get the day of the week: ");
        int day = scanner.nextInt();
        if(day==0){
            System.out.println("exiting..");
            break;
        }
        switch(day){
            case 1:System.out.println("monday");
            break;
            case 2:System.out.println("tuesday");
            break;
            case 3:System.out.println("wednesday");
            break;
            case 4:System.out.println("thursday");
            break;
            case 5:System.out.println("friday");
            break;
            case 6:System.out.println("saturday");
            break;
            case 7:System.out.println("sunday");
            break;

            default:System.out.println("invalid choice");
            



                }

        }
    }}