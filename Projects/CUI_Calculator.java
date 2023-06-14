import java.util.Scanner;

public class CUI_Calculator {
    public static void main(String[] args){
        System.out.println(" ");
        System.out.println("Welcome to the CUI Calculator!");
        System.out.println(" ");
        System.out.println("""
                Choose the operation you want to perform:
                1 => Addition (+)
                2 => Subtraction (-)
                3 => Multiplication (x)
                4 => Division (/)
                5 => Remiander (%)
                """);
        Scanner choice = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice_ = choice.nextInt();


         if (choice_==1){
            Scanner numbers = new Scanner(System.in);
            System.out.println(" ");
            System.out.print("Enter your 1st number: ");
            double num1 = numbers.nextDouble();
            System.out.print("Enter your 2nd number: ");
            double num2 = numbers.nextDouble();
            System.out.println("-----------------------------------------");
            System.out.println("=> " + num1 + " + " + num2 + " = " + (num1+num2));
            System.out.println("-----------------------------------------");
            numbers.close();
        }
        else if(choice_==2){
            Scanner numbers = new Scanner(System.in);
            System.out.println(" ");
            System.out.print("Enter your 1st number: ");
            double num1 = numbers.nextDouble();
            System.out.print("Enter your 2nd number: ");
            double num2 = numbers.nextDouble();
            System.out.println("-----------------------------------------");
            System.out.println("=> " + num1 + " - " + num2 + " = " + (num1-num2));
            System.out.println("-----------------------------------------");
            numbers.close();
        }
        else if(choice_==3){
            Scanner numbers = new Scanner(System.in);
            System.out.println(" ");
            System.out.print("Enter your 1st number: ");
            double num1 = numbers.nextDouble();
            System.out.print("Enter your 2nd number: ");
            double num2 = numbers.nextDouble();
            System.out.println("-----------------------------------------");
            System.out.println("=> " + num1 + " x " + num2 + " = " + (num1*num2));
            System.out.println("-----------------------------------------");
            numbers.close();
        }
        else if(choice_==4){
            Scanner numbers = new Scanner(System.in);
            System.out.println(" ");
            System.out.print("Enter your 1st number: ");
            double num1 = numbers.nextDouble();
            System.out.print("Enter your 2nd number: ");
            double num2 = numbers.nextDouble();
            System.out.println("-----------------------------------------");
            System.out.println("=> " + num1 + " / " + num2 + " = " + (num1/num2));
            System.out.println("-----------------------------------------");
            numbers.close();
        }
        else if(choice_==5){
            Scanner numbers = new Scanner(System.in);
            System.out.println(" ");
            System.out.print("Enter your 1st number: ");
            double num1 = numbers.nextDouble();
            System.out.print("Enter your 2nd number: ");
            double num2 = numbers.nextDouble();
            System.out.println("-----------------------------------------");
            System.out.println("=> The reaminder of " + num1 + " / " + num2 + " = " + (num1%num2));
            System.out.println("-----------------------------------------");
            numbers.close();
        }
        else{
            System.out.println("-----------------------------------------");
            System.out.println("Invalid Input! Please try again :( ");
            System.out.println("-----------------------------------------");
        }

        choice.close();
    }
}