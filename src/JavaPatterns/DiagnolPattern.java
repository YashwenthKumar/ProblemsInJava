package JavaPatterns;

import java.util.Scanner;

public class DiagnolPattern {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter the input String: ");
        String string_input = input.nextLine();
        int n = string_input.length();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==i){
                    System.out.print(string_input.charAt(i-1)+" ");
                } else if (i+j == n+1) {
                    System.out.print(string_input.charAt(i-1)+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
