package array;

import java.util.Arrays;

public class zerosatend {
    public static void main(String[] args) {
        int[] nums={1,2,0,4,5,7,0,3,4};
        int a=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
               nums[a]=nums[i];
               a++;
            }
           
        }
        for(int i=a;i<nums.length;i++){
           nums[i]=0;
        }
        System.out.println(Arrays.toString(nums));
    }
}