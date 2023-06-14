import java.util.Scanner;

public class Odd_Even_v1 {
    public static void main(String[] args){
        System.out.println("");
        System.out.println("Welcome to the CUI Odd or Even Checker!");
        Scanner checker = new Scanner(System.in);
        System.out.print("Enter a number: "); //39
        long num = checker.nextLong();

        if (num%2!=0){ //odd numbers
            System.out.println("---------------------------------------");
            System.out.println("=> "+ num + " is an odd number.");
            System.out.println("---------------------------------------");
        }
        else if (num==0){ //Zero
            System.out.println("---------------------------------------");
            System.out.println("=> Number is zero.");
            System.out.println("---------------------------------------");
        }
        else if (num%2==0){ //Even
            System.out.println("---------------------------------------");
            System.out.println("=> "+ num + " is an even number.");
            System.out.println("---------------------------------------");
        }
        else{ //Invalid Input
            System.out.println("---------------------------------------");
            System.out.println("=> Invalid Input! Please try again :(");
            System.out.println("---------------------------------------");
        }
        
        checker.close();
    }
}