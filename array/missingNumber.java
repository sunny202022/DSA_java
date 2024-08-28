package array;

import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[] nums={0,2,3,4,5,6};
        System.out.println(missing(nums));
    }
    public static int missing(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
    
}
