package leetcode.arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // brute force O(n^2)
    public int[] twoSumBruteForce(int[] nums, int target) {
        int [] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    // hash map O(n)
    public int[] twoSumHashMap(int[] nums, int target) {
        int [] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                result[0] = i;
                result[1] = map.get(target - nums[i]);
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
