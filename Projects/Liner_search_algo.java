import java.util.Scanner;

public class Liner_search_algo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Linear Search Algorithm!");
        System.out.print("Enter the size of the array: ");
        int num = sc.nextInt();

        System.out.println(" ");
        System.out.println("Enter the values: ");
        int[] arr = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the key value: ");
        int key = sc.nextInt();

        int default_ans = -1;

        //First occurence:
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                default_ans = i;
                break;
            }else{
                default_ans=-1;
            }
        }

        //last occurence:
        // for(int i=num-1;i>=0;i--){
        //     if(arr[i]==key){
        //         default_ans = i;
        //         break;
        //     }else{
        //         default_ans=-1;
        //     }
        // }
        
        System.out.println("------------------------------");
        System.out.println("The index value of " + key + " is " + default_ans);
        System.out.println("------------------------------");
        sc.close();

    }
}
