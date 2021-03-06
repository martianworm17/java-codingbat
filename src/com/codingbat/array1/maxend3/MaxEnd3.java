package com.codingbat.array1.maxend3;

public class MaxEnd3 {

    public static void main(String[] args) {
        System.out.println(maxEnd3(new int[] {1, 2, 3}));
        System.out.println(maxEnd3(new int[] {11, 5, 9}));
        System.out.println(maxEnd3(new int[] {2, 11, 3}));
    }

    private static int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[nums.length-1]);

        return new int[] {max, max, max};
    }
}
