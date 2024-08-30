package array;


public class printmaxSubarray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(pmaxSubArray(nums));
    }
    public static int pmaxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE; // maximum sum
        int sum = 0;
        int start=0;
        int ansstart=-1;
        int ansend=-1;
        for (int i = 0; i < nums.length; i++) {
            if (sum == 0) start = i;
            sum += nums[i];
            if (sum > maxi) {
                maxi = sum;
                ansstart=start;
                ansend=i;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.print("The subarray is: [");
        for (int i = ansstart; i <= ansend; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.print("]\n");

        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        return maxi;
    }
}