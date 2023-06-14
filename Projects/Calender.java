import java.util.Scanner;

public class Calender {
    public static void main(String[] args){
        System.out.println("");
        Scanner check = new Scanner(System.in);
        System.out.print(">> Enter the month number: ");
        int month = check.nextInt();

        switch (month){
            case 1: 

                System.out.println("---------------");
                System.out.println("January");
                System.out.println("31 Days");
                System.out.println("---------------");
                break;


            case 2: 

                Scanner feb = new Scanner(System.in);
                System.out.print("Is it a leap year?: ");
                String leap_year = feb.nextLine();
                System.out.println(" ");
                System.out.println("---------------");
                System.out.println("February");
                
                switch(leap_year){
                    case "Yes","yes" ->{
                        System.out.println("29 Days");
                        System.out.println("---------------");
                    }
                    default ->{
                        System.out.println("28 Days");
                        System.out.println("---------------");
                    }
                }
                break;


            case 3: 

                System.out.println("---------------");
                System.out.println("March");
                System.out.println("31 Days");
                System.out.println("---------------");
                break;


            case 4: 

                System.out.println("---------------");
                System.out.println("April");
                System.out.println("30 Days");
                System.out.println("---------------");
                break;


            case 5:

                System.out.println("---------------");
                System.out.println("May");
                System.out.println("31 Days");
                System.out.println("---------------");
                break; 


            case 6: 

                System.out.println("---------------");
                System.out.println("June");
                System.out.println("30 Days");
                System.out.println("---------------");
                break;


            case 7: 

                System.out.println("---------------");
                System.out.println("July");
                System.out.println("31 Days");
                System.out.println("---------------");
                break;  
                
                
            case 8: 

                System.out.println("---------------");
                System.out.println("August");
                System.out.println("31 Days");
                System.out.println("---------------");
                break;


            case 9: 

                System.out.println("---------------");
                System.out.println("September");
                System.out.println("30 Days");
                System.out.println("---------------");
                break;


            case 10: 

                System.out.println("---------------");
                System.out.println("October");
                System.out.println("31 Days");
                System.out.println("---------------");
                break;


            case 11: 

                System.out.println("---------------");
                System.out.println("November");
                System.out.println("30 Days");
                System.out.println("---------------");
                break;


            case 12: 

                System.out.println("---------------");
                System.out.println("December");
                System.out.println("31 Days");
                System.out.println("---------------");
                break;


            default:
                System.out.println("-----------------------------------------");
                System.out.println("Invalid month number! Please try again :(");
                System.out.println("-----------------------------------------");
        }

        check.close();
    }
}



