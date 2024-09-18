/*
 * 179. Largest Number

Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

 

Example 1:

Input: nums = [10,2]
Output: "210"
Example 2:

Input: nums = [3,30,34,5,9]
Output: "9534330"
 */
import java.util.*;

public class  P3_LargestNumber2{
    public static String largestNumber(int[] nums){
          // Convert the integer array to a string array
        String[] numsStr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsStr[i] = String.valueOf(nums[i]);
        }

        // Implement a bubble sort (or any other sort) to sort based on custom logic
        for (int i = 0; i < numsStr.length - 1; i++) {
            for (int j = i + 1; j < numsStr.length; j++) {
                String order1 = numsStr[i] + numsStr[j];
                String order2 = numsStr[j] + numsStr[i];
                // Swap if numsStr[j] + numsStr[i] is greater than numsStr[i] + numsStr[j]
                if (order1.compareTo(order2) < 0) {
                    // Swap the two strings
                    String temp = numsStr[i];
                    numsStr[i] = numsStr[j];
                    numsStr[j] = temp;
                }
            }
        }

        // Edge case: If the largest number is "0", return "0"
        if (numsStr[0].equals("0")) {
            return "0";
        }

        // Build the largest number by concatenating the sorted strings
        StringBuilder largestNumber = new StringBuilder();
        for (String numStr : numsStr) {
            largestNumber.append(numStr);
        }

        return largestNumber.toString();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element:-");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.printf("Enter %d array element: \n\n ",n);

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();

        }


        String k=largestNumber(nums);
        System.out.println(k);
      


    }
}