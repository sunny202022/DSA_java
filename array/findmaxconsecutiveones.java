package array;

public class findmaxconsecutiveones {
    public static void main(String[] args) {
        int[] nums={0,1,0,1,1,1,0,0,1};
        int n = nums.length;
        int count = 0;
        int a = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                if (a < count) {
                    a = count;
                }

                count = 0;
            }
        }
        if (a > count)
            System.out.println(a);
        else
            System.out.println(count);
    }
}
