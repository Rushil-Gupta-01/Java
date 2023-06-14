import java.util.Scanner;

public class Odd_Even_v2 {
    public static void main(String[] args){
        System.out.println("");
        System.out.println("Welcome to the CUI Odd or Even Checker!");
        Scanner checker = new Scanner(System.in);
        System.out.print("Enter a number: "); //39
        long num = checker.nextLong();

        String result = num%2==0 ? num + " is an even Number":num + " is an odd Number";

        System.out.println("---------------------------------------");
        System.out.println(result);
        System.out.println("---------------------------------------");
        checker.close();
    }
}
