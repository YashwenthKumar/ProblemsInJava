package ProblemsOnArrays;

import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+ (i+1) +" : ");
            arr[i] = input.nextInt();
        }
        int sum=0,x,y;
        System.out.println("Enter indices: ");
        x = input.nextInt();
        y = input.nextInt();
        for(int i=x;i<=y;i++){
            sum += arr[i];
        }
        System.out.println("Sum: "+sum);
    }
}
class ArraySum{
    public int n;
}