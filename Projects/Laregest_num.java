import java.util.Scanner;

public class Laregest_num {
    public static void main(String[] args){
        
        System.out.print("Enter the number of integers: ");
        Scanner value = new Scanner(System.in);
        int num = value.nextInt();

        int answer = Integer.MIN_VALUE;

        System.out.println("Enter the numbers: ");
        for(int i =1; i<=num;i+=1){
            int numbers = value.nextInt();

            answer = Math.max(answer, numbers);
        }
        System.out.println("The largest numbers is " + answer);
        value.close();
    }
}
