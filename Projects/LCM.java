import java.util.Scanner;
public class LCM{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int A = sc.nextInt();
        System.out.print("Enter second number: ");
        int B = sc.nextInt();
        
        int lcm = (A>B)?A:B;
        while(true){
            if(lcm%A==0 && lcm%B==0){
                System.out.println("The lcm of " + A + " and " + B + " is " + lcm);
                break;
            }
            lcm+=1;
        }
        sc.close();
    }
}