/*
9. Palindrome Number

Given an integer x, return true if x is a 
palindrome, and false otherwise.
 */
import java.util.Scanner;

public class P1_PallindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to cheak wheather it is pallindrome or not:-");
        int num=sc.nextInt();
        int r,pallin=0,p=num;

        while(num>0){
            r=num%10;
            pallin=(pallin*10)+r;
            num/=10;
        }
        if(p==pallin){
            System.out.println("The given number is Pallindrome");
        }
        else{
            System.out.println("The given number is not Pallindrome");
        }
        
    }
}
