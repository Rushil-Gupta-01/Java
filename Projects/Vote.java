import java.util.Scanner;
public class Vote{
    public static void main(String[] args){
        Scanner eligibility = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = eligibility.nextInt();

        System.out.print("Enter the country you reside in: ");
        String country = eligibility.next();

        if (age>=18 && country.equals("India")){
            System.out.println(" ");
            System.out.println(">> You are eligible to vote in India.");
            System.out.println(" ");
        }
        else{
            System.out.println(" ");
            System.out.println(">> You are not eligible to vote in India.");
            System.out.println(" ");
        }
        eligibility.close();
    }
}