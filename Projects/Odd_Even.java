
import java.util.Scanner;
public class Odd_Even {
    public static void main(String[] args){
        System.out.println("Enter your number: ");
        Scanner check_odd_even = new Scanner(System.in);
        int N = check_odd_even.nextInt();

        if (N%2 != 0){
            System.out.println("=> ODD NUMBER");
        }
        else if (N%2 == 0){
            System.out.println("=> EVEN NUMBER");
        }
        else{
            System.out.println("Invalid Input!");
        }
        check_odd_even.close();
    }
}

