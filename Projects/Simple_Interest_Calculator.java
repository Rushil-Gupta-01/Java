import java.util.Scanner;

public class Simple_Interest_Calculator {
    public static void main(String[] args){
        Scanner simpleInterest = new Scanner(System.in);
        
        //principle:
        System.out.print("Enter principle amount (in Rs.): ");
        double principle = simpleInterest.nextLong();

        //Rate:
        System.out.print("Enter rate of interest (in %): ");
        double rate = simpleInterest.nextInt();

        //Time:
        System.out.print("Enter time period (in years): ");
        double time = simpleInterest.nextShort();
        
        System.out.println("-------------------------------");

        double SI = (principle * rate * time)/100;
        System.out.println("Simple Interest => Rs." + SI);
        
        double amount = SI + principle;
        System.out.println("Amount => Rs." + amount);

        System.out.println("-------------------------------");
    
        simpleInterest.close();
    }
}
