import java.util.*;
public class Random_num {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int sum =0;
        for(int i=1; i<=N; i++){
            sum+=i;
        }
        System.out.println(sum);

        scanner.close();
    }
}
