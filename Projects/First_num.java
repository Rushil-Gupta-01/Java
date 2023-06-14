import java.util.Scanner;
public class First_num {
    public static void main(String[] args){
        int num=1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();

        while(num<=range){
            System.out.println(num);
            num++;
        }
        sc.close();
    }
}
