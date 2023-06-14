import java.util.Scanner;

public class Organization {
    public static void main(String[] args){
        Scanner employee = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Enter your organization: ");
        String org = employee.nextLine();

        if(org.equals("Scaler") || org.equals("Interviewbit") || org.equals("Salwan Public School")){
            System.out.println("----------------------------------------");
            System.out.println(">> Access Granted!");
            System.out.println("----------------------------------------");

        } else{
            System.out.println("----------------------------------------");
            System.out.println(">> Access Denied! Please try again :(");
            System.out.println("----------------------------------------");
        }

        employee.close();
    }
}
