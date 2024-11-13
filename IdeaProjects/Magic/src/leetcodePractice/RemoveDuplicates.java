package leetcodePractice;

import java.util.Arrays;

public class RemoveDuplicates {
    // Remove Duplicates from Sorted Array

    public static int removeDuplicates(int[] nums) {
        int uniqueIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 5, 5, 6, 7};
        int k = removeDuplicates(nums);

        int[] uniqueNums = Arrays.copyOf(nums, k);
        System.out.println("Nums: " + Arrays.toString(uniqueNums));
    }
}
