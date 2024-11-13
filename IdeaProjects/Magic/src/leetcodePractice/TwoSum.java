package leetcodePractice;

/*
Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println("Two sum: " + Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] indices = new int[2];
        int complement = 0;

        for(int i = 0; i < nums.length; i++) {
            complement = target - nums[0];
            if(map.containsKey(complement)) {
                indices[0] = map.get(complement);
                indices[1] = i;
                return indices;
            } else {
                map.put(nums[i], i);
            }
        }
        return indices;
    }
}
