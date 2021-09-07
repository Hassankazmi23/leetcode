package leetcode.arrays.easy;

public class MaximumSubArray {

    public int maxSubArray(int[] nums) {


        int currSum = nums[0];
        int maxSum = currSum;
        for(int i = 1; i < nums.length; i++) {
            currSum = currSum + nums[i];
            if(nums[i]  > currSum) {
                currSum = nums[i];
            }
            if(currSum > maxSum) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }

}
