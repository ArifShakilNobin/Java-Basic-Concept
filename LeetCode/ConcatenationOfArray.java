package LeetCode;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length ;
        int [] ans = new int[2*n];

        for (int i=0; i<nums.length ; i++){
            ans[i] = nums[i] ;
            ans[i+n] = nums[i];// ans[0+3] = ans[3] =nums[0]
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        ConcatenationOfArray p = new ConcatenationOfArray();
        p.getConcatenation(nums);
    }
}
