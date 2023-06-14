import java.util.Scanner;
public class Sum_of_positive_numbers{
    public static void main(String[] args){
        Scanner integers = new Scanner(System.in);
        int num;
        int sum=0;

        do{
            num = integers.nextInt();
            sum+=num;
        }while(num>=0);
        System.out.println(sum);


        integers.close();
    }
}