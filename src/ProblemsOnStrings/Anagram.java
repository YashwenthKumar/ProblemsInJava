package ProblemsOnStrings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String str1 = input.nextLine();
        System.out.println("Enter string 2: ");
        String str2 = input.nextLine();
        if(areAnagrams(str1,str2)){
            System.out.println(str1+" and "+str2+" are anagrams.");
        }else{
            System.out.println(str1+" and "+str2+" are not anagrams.");
        }

    }
public static boolean areAnagrams(String s1,String s2){
    if(s1.length()!= s2.length()){
        return false;
    }
    char[] arr1 = s1.toCharArray();
    char[] arr2 = s2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Arrays.equals(arr1,arr2);
 }
}
