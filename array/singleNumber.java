package array;

public class singleNumber {
    public static void main(String[] args) {
        int[] nums={1,2,4,2,5,1,5};
        System.out.println(singleNum(nums));
    }
    public static int singleNum(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }

}
