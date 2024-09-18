


/*


Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

 

Example 1:

Input: nums = [10,2]
Output: "210"
Example 2:

Input: nums = [3,30,34,5,9]
Output: "9543330"
 */
import java.util.Scanner;
public class P2_LargestNumber {

    public static String largestNumber(int[] nums){
        
        int j=0,n=nums.length,number,remainder;
        int[] arr=new int[n*2];
        for(int i=0;i<n;i++){
            number=nums[i];
            if(nums[i]<10){
               
                arr[j]=nums[i];
                j++;
            }
            else{
                while(number>0){
                    remainder=number%10;
                    number/=10;
                    arr[j]=remainder;
                    j++;

                }
            }
        }

        for(int i=0;i<j;i++){
            for(int k=i+1;k<j;k++){
                if(arr[i]<arr[k]){
                    int temp=arr[i];
                    arr[i]=arr[k];
                    arr[k]=temp;
                }
                
            }
        }
        String largnum="";

        for(int i=0;i<j;i++){
            largnum+=arr[i];
        }

        return largnum;

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
