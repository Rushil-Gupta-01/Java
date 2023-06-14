import java.util.Scanner;

public class Digits {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner num = new Scanner(System.in);
        long n = num.nextLong();
        long number = (n);

        int digits = 0;
        while(n>0){
            n/=10;
            digits++;
        }
        System.out.println("The number of digits in " + number + " are " + digits);

        num.close();
    }
}
