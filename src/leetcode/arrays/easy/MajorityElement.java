package leetcode.arrays.easy;

import java.util.Arrays;

public class MajorityElement {
    // sorting (O)nlogn
    public int majorityElement(int[] nums) {

        if(nums.length == 1) {
            return nums[0];
        }

        int majorityElement = 1;

        Arrays.sort(nums);
        int j = 1;
        for(int i = 0; i < nums.length -1; i++) {
            if (nums[i] == nums[j]) {
                majorityElement++;
                if(majorityElement > nums.length/2) {
                    majorityElement = nums[i];
                    break;
                }
            }
            else {
                majorityElement = 1;
            }
            j++;
        }
        return majorityElement;
    }
    // (O)n
    public int majorityElement2(int [] nums) {

        int candidate = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                candidate = nums[i];
            }
            count += (candidate == nums[i]) ? 1 : -1;
        }

        return candidate;

    }
}
