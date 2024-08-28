package array;

import java.util.Arrays;

public class RearrangeArraySign {
    public static void main(String[] args) {
        int[] nums={3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
    public static int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] negative=new int[n];
        int j=0;
        int k=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                negative[0+j]=nums[i];
                j=j+2;
            }
            else{
                negative[0+k]=nums[i];
                k=k+2;
            }
        }
        return negative;
    }
}
