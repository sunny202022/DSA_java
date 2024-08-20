package array;

import java.util.Arrays;

public class rotatearray {
    public static void reverse(int[] arr, int low, int high){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void main(String[] main) {
        int[] nums={2,3,4,5,6,7,8};
        int k=4;
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        System.out.println(Arrays.toString(nums));           
    }
}
