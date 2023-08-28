package LeetCode;

public class ZeroBasedPermutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        };
        return ans;
    }



    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        ZeroBasedPermutation p = new ZeroBasedPermutation();
        p.buildArray(nums);
    }
}
